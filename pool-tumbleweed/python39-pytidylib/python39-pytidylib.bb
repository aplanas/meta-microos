SUMMARY = "Python wrapper for HTML Tidy (tidylib) on Python 2 and 3"
DESCRIPTION = "`PyTidyLib`_ is a Python package that wraps the `HTML Tidy`_ library. This \
allows you, from Python code, to 'fix' invalid (X)HTML markup. Some of the \
library's many capabilities include: \
 \
* Clean up unclosed tags and unescaped characters such as ampersands \
* Output HTML 4 or XHTML, strict or transitional, and add missing doctypes \
* Convert named entities to numeric entities, which can then be used in XML \
  documents without an HTML doctype. \
* Clean up HTML from programs such as Word (to an extent) \
* Indent the output, including proper (i.e. no) indenting for ``pre`` elements, \
  which some (X)HTML indenting code overlooks. \
 \
Small example of use \
==================== \
 \
The following code cleans up an invalid HTML document and sets an option:: \
 \
    from tidylib import tidy_document \
    document, errors = tidy_document('''<p>f&otilde;o <img src='bar.jpg'>''', \
      options={'numeric-entities':1}) \
    print document \
    print errors"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-pytidylib-0.3.2-2.6.noarch.rpm"
RPM_HASH = "98fa2a89287e2d0850335d08509ba9089158e3e7e0af60bda4863193a7784819644b3d7ced5cc355e79ab7fb243fbae0e1641bdd7ca11c9bf96df4e9df4e0dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytidylib \
python39-pytidylib \
python3dist-pytidylib"

RDEPENDS:${PN} += "python-abi"

inherit rpm

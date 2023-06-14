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

RPM_NAME = "python310-pytidylib-0.3.2-2.6.noarch.rpm"
RPM_HASH = "b4eea1199e71e99a59b422340e16cce80fff7dfc54445c0750549c9fb36d7a9d875285c77a59be7f6bd17cf1556b0e08285db5cf57069c5ae4fe16b369560bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytidylib \
python3.10dist-pytidylib \
python310-pytidylib \
python3dist-pytidylib"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "A toolkit for generation of output for the web - Documentation"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid. \
 \
This package contains documentation and examples."
LICENSE = "BSD-3-Clause"

PV = "0.7.7"

RPM_NAME = "python-Genshi-doc-0.7.7-3.1.noarch.rpm"
RPM_HASH = "fed78306dc060a1d89c4baac7c9bb1df53bfad7639f75b855a425113033cc4bd072bdd7547f351dfd0773b30683ca8192a3b1f991a7607ded84e2a11ea10b2ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Genshi-doc \
python310-Genshi-doc \
python311-Genshi-doc \
python39-Genshi-doc"

RDEPENDS:${PN} += ""

inherit rpm

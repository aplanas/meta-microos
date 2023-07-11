SUMMARY = "A toolkit for generation of output for the web - Documentation"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid. \
 \
This package contains documentation and examples."
LICENSE = "BSD-3-Clause"

PV = "0.7.7"

RPM_NAME = "python-Genshi-doc-0.7.7-3.3.noarch.rpm"
RPM_HASH = "6bb0a9e28d3899c8eb83f1eddd6d768d18803f408d813ca8b955d56e003126c5181464ddce6e7afea5f9ff279238c49abe5ddf226d1e4bc63b0e06f160583f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Genshi-doc \
python310-Genshi-doc \
python311-Genshi-doc \
python39-Genshi-doc"

RDEPENDS:${PN} += ""

inherit rpm

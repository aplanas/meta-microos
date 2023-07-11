SUMMARY = "A toolkit for generation of output for the web"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid."
LICENSE = "BSD-3-Clause"

PV = "0.7.7"

RPM_NAME = "python311-Genshi-0.7.7-3.3.aarch64.rpm"
RPM_HASH = "a58a7018db8e1141e457b503655b48af2ac6dbb33f09090c67bc05eb11edb5b62f8895ca806837bd0d70011b543665e6a5778b31ea2bbcd38b115aea0c95fc4e"

RPROVIDES:${PN} += "python3-Genshi \
python3.11dist-genshi \
python311-Genshi \
python3dist-genshi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Babel \
python311-six \
python311-xml"

inherit rpm

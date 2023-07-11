SUMMARY = "A toolkit for generation of output for the web"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid."
LICENSE = "BSD-3-Clause"

PV = "0.7.7"

RPM_NAME = "python310-Genshi-0.7.7-3.3.aarch64.rpm"
RPM_HASH = "4516c884327be5414878fa2677cc254d1e79ce8a73baa755de08d671f881d40a0c41d422064a30b2a0c5ec2544503ff2554f06d0d594393b2f221156d8a0696c"

RPROVIDES:${PN} += "python3.10dist-genshi \
python310-Genshi \
python3dist-genshi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-Babel \
python310-six \
python310-xml"

inherit rpm

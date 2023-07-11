SUMMARY = "A toolkit for generation of output for the web"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid."
LICENSE = "BSD-3-Clause"

PV = "0.7.7"

RPM_NAME = "python39-Genshi-0.7.7-3.3.aarch64.rpm"
RPM_HASH = "cc8a5cfa54d4806238cd6c1ac660a421f94b16e5f6ceed646e4ab16ffd4d6f1dfe419759d21db52d55da094ca33a970f51266ed7334cf135b7cc6a5ae18d3b1e"

RPROVIDES:${PN} += "python3.9dist-genshi \
python39-Genshi \
python3dist-genshi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Babel \
python39-six \
python39-xml"

inherit rpm

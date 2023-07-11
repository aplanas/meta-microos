SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python39-tokenize-rt-4.2.1-1.11.noarch.rpm"
RPM_HASH = "85c3b43013bc31a43db5e1b95f250bbd9f095a57ef36c21a5b668d383e3381c0164489fdd2ac4c43b187ccfc10fb68219138f1304a1fc23e69cf8e63fe8e6c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tokenize-rt \
python39-tokenize-rt \
python3dist-tokenize-rt"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

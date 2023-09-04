SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python39-tokenize-rt-5.1.0-1.1.noarch.rpm"
RPM_HASH = "107dbd4a5429e410aac9275563c11e1bd9bdb0750405ad954d628eb5a6196822ec6d582627e09e5c3879a9b63f87120a944489b323f8fd357f2e169a50b78929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tokenize-rt \
python39-tokenize-rt \
python3dist-tokenize-rt"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

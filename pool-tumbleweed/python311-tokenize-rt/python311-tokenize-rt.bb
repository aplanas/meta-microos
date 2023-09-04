SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python311-tokenize-rt-5.1.0-1.1.noarch.rpm"
RPM_HASH = "c13bbbcff236bd22f6f37a063ef17dd7c3d2f745d552ecbaf030fec6762b1c1990ea1f745dee87f932e533f7541a39938d4e6f7e06976fcad15ddc8b4a002a1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tokenize-rt \
python3.11dist-tokenize-rt \
python311-tokenize-rt \
python3dist-tokenize-rt"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

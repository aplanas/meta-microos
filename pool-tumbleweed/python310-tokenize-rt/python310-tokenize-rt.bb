SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python310-tokenize-rt-4.2.1-1.9.noarch.rpm"
RPM_HASH = "7456e0d3563b6d68c48b2f753e18cf7226fb9850c1aedb957f7e7b9fc5a5531d9fda316db63eee7b69b925be7e501cb485d81df339b4441c29266400ff9fcd6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tokenize-rt \
python3.10dist-tokenize-rt \
python310-tokenize-rt \
python3dist-tokenize-rt"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm

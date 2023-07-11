SUMMARY = "A generator library for concise, unambiguous and URL-safe UUIDs"
DESCRIPTION = "A library that generates short, pretty, unambiguous unique IDs \
by using an extensive, case-sensitive alphabet and omitting \
similar-looking letters and numbers."
LICENSE = "BSD-3-Clause"

PV = "1.0.11"

RPM_NAME = "python311-shortuuid-1.0.11-2.1.noarch.rpm"
RPM_HASH = "98c6a000d79626cb2661dca9955c32ba6522a7debd3dd8fc01c9f9f6a388e8d1deedd64bd09f0a3bddd90b5a8c0804ada385abeb91c6e77f66bf3d982ba24f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shortuuid \
python3.11dist-shortuuid \
python311-shortuuid \
python3dist-shortuuid"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-base \
update-alternatives"

inherit rpm

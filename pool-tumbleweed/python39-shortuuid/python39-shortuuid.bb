SUMMARY = "A generator library for concise, unambiguous and URL-safe UUIDs"
DESCRIPTION = "A library that generates short, pretty, unambiguous unique IDs \
by using an extensive, case-sensitive alphabet and omitting \
similar-looking letters and numbers."
LICENSE = "BSD-3-Clause"

PV = "1.0.11"

RPM_NAME = "python39-shortuuid-1.0.11-2.1.noarch.rpm"
RPM_HASH = "5eda3ecc84c3de1163a67e6cc2baa0ff313bfaa2ec113a666013a27863d2a859d499a08083c830ec98c8801c2c592974ea80ca4ff6894e815e3072d4207a39f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-shortuuid \
python39-shortuuid \
python3dist-shortuuid"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-base \
update-alternatives"

inherit rpm

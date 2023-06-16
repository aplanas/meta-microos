SUMMARY = "Integer to Roman numerals converter"
DESCRIPTION = "This module converts from and to Roman numerals. It can convert numbers from \
1 to 4999 and understands the common shortcuts (IX == 9), but not illegal ones (MIM == 1999)."
LICENSE = "Python-2.0"

PV = "3.3"

RPM_NAME = "python39-roman-3.3-2.1.noarch.rpm"
RPM_HASH = "bcee8f8886c305c0a693b8774130a1e0b3a5577376cb5611e6a70771223e52f35821f102e69b6998ae59a9f1af5144bb122688916864caf2c90843b26c3be018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-roman \
python39-roman \
python3dist-roman"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm

SUMMARY = "Integer to Roman numerals converter"
DESCRIPTION = "This module converts from and to Roman numerals. It can convert numbers from \
1 to 4999 and understands the common shortcuts (IX == 9), but not illegal ones (MIM == 1999)."
LICENSE = "Python-2.0"

PV = "3.3"

RPM_NAME = "python311-roman-3.3-2.1.noarch.rpm"
RPM_HASH = "0bda317d25233719f238276a656a5e72685dcc2d368a0567bc4197e10506c61993618d493cf5551157544ee092eb4abb8287cc4cc91b1d21e59e85ef038d404f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(roman) \
python311-roman \
python3dist(roman)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi)"

inherit rpm

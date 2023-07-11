SUMMARY = "Integer to Roman numerals converter"
DESCRIPTION = "This module converts from and to Roman numerals. It can convert numbers from \
1 to 4999 and understands the common shortcuts (IX == 9), but not illegal ones (MIM == 1999)."
LICENSE = "Python-2.0"

PV = "3.3"

RPM_NAME = "python310-roman-3.3-2.2.noarch.rpm"
RPM_HASH = "ae42a885391270eb1573aa07317bb7200af7d5c75263c19b0c1c33e4792d06796b632fb7bca8093f080e89fb621bf15f47e117298fde4d5ae8206d615e1202d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-roman \
python310-roman \
python3dist-roman"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm

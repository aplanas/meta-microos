SUMMARY = "Integer to Roman numerals converter"
DESCRIPTION = "This module converts from and to Roman numerals. It can convert numbers from \
1 to 4999 and understands the common shortcuts (IX == 9), but not illegal ones (MIM == 1999)."
LICENSE = "Python-2.0"

PV = "3.3"

RPM_NAME = "python311-roman-3.3-2.2.noarch.rpm"
RPM_HASH = "70b618a5f8421fdf1257919249ec0c662e1c1749023631fd7a90cd70f53aa47cb312c7b2333f5ee69eb42748ac19896fc1d8a821ceb08d0aef75dfea1a170a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-roman \
python3.11dist-roman \
python311-roman \
python3dist-roman"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm

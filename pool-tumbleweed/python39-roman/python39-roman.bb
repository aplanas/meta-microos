SUMMARY = "Integer to Roman numerals converter"
DESCRIPTION = "This module converts from and to Roman numerals. It can convert numbers from \
1 to 4999 and understands the common shortcuts (IX == 9), but not illegal ones (MIM == 1999)."
LICENSE = "Python-2.0"

PV = "3.3"

RPM_NAME = "python39-roman-3.3-2.2.noarch.rpm"
RPM_HASH = "c5521e68524a09d4b6cc333931e4a95a90a916ada5d056e27ec0c535b0dbb4137bd592d56cfc9376d44de9848398960398937c727cad685f5ff916a7013c20df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-roman \
python39-roman \
python3dist-roman"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm

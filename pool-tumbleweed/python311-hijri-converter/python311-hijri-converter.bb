SUMMARY = "Python package to convert accurately between Hijri and Gregorian dates"
DESCRIPTION = "A Python package to convert accurately between Hijri and Gregorian dates using the Umm al-Qura calendar of Saudi Arabia."
LICENSE = "MIT"

PV = "2.2.4"

RPM_NAME = "python311-hijri-converter-2.2.4-1.4.noarch.rpm"
RPM_HASH = "3556086c39af1660b5ee674a9a5ed74fc44462c0d3f67501271b4943e92ecde227440e6f349472c930058f5f58b9c986c9bac42772766e8705b97751d92132ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hijri-converter \
python3.11dist-hijri-converter \
python311-hijri-converter \
python3dist-hijri-converter"

RDEPENDS:${PN} += "python-abi"

inherit rpm

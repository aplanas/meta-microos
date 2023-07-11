SUMMARY = "Python package to convert accurately between Hijri and Gregorian dates"
DESCRIPTION = "A Python package to convert accurately between Hijri and Gregorian dates using the Umm al-Qura calendar of Saudi Arabia."
LICENSE = "MIT"

PV = "2.2.4"

RPM_NAME = "python39-hijri-converter-2.2.4-1.4.noarch.rpm"
RPM_HASH = "c5e1106181c0822e39d341efb5468047943c3ca9f6f98ed491b40d878326ae8b842adb1da3f4adb84dc90f48fef3e2aeea11e757f9d5c12bb9bfa0aefa8f1ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hijri-converter \
python39-hijri-converter \
python3dist-hijri-converter"

RDEPENDS:${PN} += "python-abi"

inherit rpm

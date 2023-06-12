SUMMARY = "Python package to convert accurately between Hijri and Gregorian dates"
DESCRIPTION = "A Python package to convert accurately between Hijri and Gregorian dates using the Umm al-Qura calendar of Saudi Arabia."
LICENSE = "MIT"

PV = "2.2.4"

RPM_NAME = "python311-hijri-converter-2.2.4-1.2.noarch.rpm"
RPM_HASH = "8fd99a9c628a49960f7e057cb5af954a5b101e4f21e2d750d4ff80ab7e0eff958e01f15c59049a9248c0c715184eb700c7559bdf59c18004bb5d691aef00a5c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hijri-converter) \
python311-hijri-converter \
python3dist(hijri-converter)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

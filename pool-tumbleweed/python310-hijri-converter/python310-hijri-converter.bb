SUMMARY = "Python package to convert accurately between Hijri and Gregorian dates"
DESCRIPTION = "A Python package to convert accurately between Hijri and Gregorian dates using the Umm al-Qura calendar of Saudi Arabia."
LICENSE = "MIT"

PV = "2.2.4"

RPM_NAME = "python310-hijri-converter-2.2.4-1.4.noarch.rpm"
RPM_HASH = "b071a010ea9e5d4ac74de4fe34a244a49fe002e421d41a2f8c13b44f15baf66882120b4592db51ca4588d648125c3dd346b4eb77646b3c56be4da119a31372ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hijri-converter \
python310-hijri-converter \
python3dist-hijri-converter"

RDEPENDS:${PN} += "python-abi"

inherit rpm

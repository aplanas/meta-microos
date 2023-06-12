SUMMARY = "Python package to convert accurately between Hijri and Gregorian dates"
DESCRIPTION = "A Python package to convert accurately between Hijri and Gregorian dates using the Umm al-Qura calendar of Saudi Arabia."
LICENSE = "MIT"

PV = "2.2.4"

RPM_NAME = "python310-hijri-converter-2.2.4-1.2.noarch.rpm"
RPM_HASH = "b51ddf7ecaa8cbdb2989411f8cc0618c37714717cde08e9150474c8be962c2e1e4625b5f768b3759a3862e43d518eb6427e298ec472b8a372165a999260e3098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hijri-converter \
python3.10dist(hijri-converter) \
python310-hijri-converter \
python3dist(hijri-converter)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

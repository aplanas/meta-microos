SUMMARY = "Elegant astronomy for Python"
DESCRIPTION = "A Python astronomy package that makes it easy to generate high precision \
research-grade positions for planets and Earth satellites."
LICENSE = "MIT"

PV = "1.45"

RPM_NAME = "python39-skyfield-1.45-2.5.noarch.rpm"
RPM_HASH = "a6bf5e865e86d9854f614eb4a8a7fd5071d0d6ede9a0c1114052ca533f195d3748f574e44440f4e12ac62a6d0e09a85df10f7ff90d7913dba594508ce5f22f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-skyfield"

RDEPENDS:${PN} += "python39-astropy \
python39-beautifulsoup4 \
python39-certifi \
python39-html5lib \
python39-jplephem \
python39-lxml \
python39-matplotlib \
python39-numpy \
python39-pandas \
python39-sgp4"

inherit rpm

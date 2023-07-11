SUMMARY = "Elegant astronomy for Python"
DESCRIPTION = "A Python astronomy package that makes it easy to generate high precision \
research-grade positions for planets and Earth satellites."
LICENSE = "MIT"

PV = "1.45"

RPM_NAME = "python310-skyfield-1.45-2.5.noarch.rpm"
RPM_HASH = "6db7f9f79cf4e4bf9a9d68c28689d168f5c0715d3b31b5949afb94fa4cc77992dfd49fdc8ebb7b7a316c84961c46b91cb0421446f9b4db85e71666d0f3707231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-skyfield"

RDEPENDS:${PN} += "python310-astropy \
python310-beautifulsoup4 \
python310-certifi \
python310-html5lib \
python310-jplephem \
python310-lxml \
python310-matplotlib \
python310-numpy \
python310-pandas \
python310-sgp4"

inherit rpm

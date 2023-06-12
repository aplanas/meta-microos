SUMMARY = "Elegant astronomy for Python"
DESCRIPTION = "A Python astronomy package that makes it easy to generate high precision \
research-grade positions for planets and Earth satellites."
LICENSE = "MIT"

PV = "1.45"

RPM_NAME = "python310-skyfield-1.45-2.4.noarch.rpm"
RPM_HASH = "5309cbf20bfde5ed872c8073ddc0a980c57d0ee01bff0cd00a3074961b6369b46a84aebffc4579ea7a9883ae28a26085077036c9cb7cee5b7cbf50e44e5590e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-skyfield \
python3.10dist(skyfield) \
python310-skyfield \
python3dist(skyfield)"
RDEPENDS:${PN} += "python(abi) \
python310-astropy \
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

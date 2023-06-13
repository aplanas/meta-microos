SUMMARY = "Elegant astronomy for Python"
DESCRIPTION = "A Python astronomy package that makes it easy to generate high precision \
research-grade positions for planets and Earth satellites."
LICENSE = "MIT"

PV = "1.45"

RPM_NAME = "python39-skyfield-1.45-2.4.noarch.rpm"
RPM_HASH = "0c1d15e2dc1e23e84b20f1f11e1f5f89cf15917db081e270edc7d3d83218c5bb1c8b798c548f486555ad6f5d99625345468e27aba5e74582f500b1a0fe67e975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(skyfield) \
python39-skyfield \
python3dist(skyfield)"

RDEPENDS:${PN} += "python(abi) \
python39-astropy \
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

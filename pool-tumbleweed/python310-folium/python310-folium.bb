SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-folium-0.14.0-2.5.noarch.rpm"
RPM_HASH = "091d6dd1a3f924ce05d29bcd8160652d9afb41ae2ac3e5f72b937dc867ab80984d2aca598592f134959645523a9b7cc3e40303e0bbc9e78be2abce1277ff7ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-folium \
python310-folium \
python3dist-folium"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-branca \
python310-numpy \
python310-requests"

inherit rpm

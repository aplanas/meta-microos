SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-folium-0.14.0-2.5.noarch.rpm"
RPM_HASH = "cd2c16b6c55855e626117249fd4d755cda7d2d54a110779d4060f0e85be1d43fcb0668080b779f7fd701cf167670bc037b3b45b4974e733deac64bb18f950f35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-folium \
python39-folium \
python3dist-folium"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-branca \
python39-numpy \
python39-requests"

inherit rpm

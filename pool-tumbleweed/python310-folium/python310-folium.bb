SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-folium-0.14.0-2.2.noarch.rpm"
RPM_HASH = "58d64544988f1bdbd801ae2a5ca84c6272556286c21b44bfd583e45a75c15dd57fc4c703e374d670647755c1ff55b202bbc13c39502102d943ad86f3ca0ccf4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-folium \
python3.10dist-folium \
python310-folium \
python3dist-folium"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-branca \
python310-numpy \
python310-requests"

inherit rpm

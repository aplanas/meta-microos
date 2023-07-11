SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-folium-0.14.0-2.4.noarch.rpm"
RPM_HASH = "56408f3cd8ca9d9929ada12b742752e9842e2406c607bf07938df650443f7848b2fcae489930bc6f7b19bc903d4516f31906feaf350d5e1370630f56d8ec0f0c"
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

SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-folium-0.14.0-2.2.noarch.rpm"
RPM_HASH = "6f2c390318371524f5b373d5d24c6aef1630e510a2bf2f640fc6e478dfaa84764e46e6c6330478b33ea71bb2aab5f4d007178ef8ccfc60a6b4f7916db12915ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(folium) \
python39-folium \
python3dist(folium)"

RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-branca \
python39-numpy \
python39-requests"

inherit rpm

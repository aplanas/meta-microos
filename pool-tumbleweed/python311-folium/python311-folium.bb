SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-folium-0.14.0-2.4.noarch.rpm"
RPM_HASH = "af293d9663e13092938138fa5f4212dbdc532375f127954b809bd7c02f4efcfe3532afbd59ba4feeb01a3b1135dfd18e793773333a4ffd165be9489949a16563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-folium \
python3.11dist-folium \
python311-folium \
python3dist-folium"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-branca \
python311-numpy \
python311-requests"

inherit rpm

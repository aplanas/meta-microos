SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-folium-0.14.0-2.5.noarch.rpm"
RPM_HASH = "82d0819be41177adee9c0ff2b732771fc12de45f6a6f72b8f8fd7880e31f375e2b52064032ab92a8ce8ae35b66e4eb8659e7f6209076d1124aa5b8ac0061d151"
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

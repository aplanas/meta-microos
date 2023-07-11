SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-folium-0.14.0-2.4.noarch.rpm"
RPM_HASH = "a5f7dc7e6e285c7c91e856f4c7ff96d00832c26f7e795674f294f06edd9cb82ff3b20b695034e13b81df1504622e929c7ca4179fbee5a5d70548081e6ba6d038"
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

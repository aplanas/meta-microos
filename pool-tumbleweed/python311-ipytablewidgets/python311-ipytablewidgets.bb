SUMMARY = "Widgets to help facilitate reuse of large tables across widgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
ipytablewidgets is a set of widgets and traitlets to reuse of large tables such as Pandas DataFrames \
across different widgets, and different packages. \
 \
The major parts of ipytablewidgets are: \
 \
- Traits/Widgets definitions \
- Adapters to convert tables to those traits \
- Serializers/deserializers to send the data across the network \
- Apropriate javascript handling and representation of the data"
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "python311-ipytablewidgets-0.3.1-1.1.noarch.rpm"
RPM_HASH = "608345b3685b01868704a115dc5ffff1ae7a5eb8a16501e54d8ae2c90f2c9b5e7d4731d2ce38b17f1e10ea7c1228fc54057aa6155d354bfdc101090755ecc163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipytablewidgets) \
python311-ipytablewidgets \
python3dist(ipytablewidgets)"

RDEPENDS:${PN} += "python(abi) \
python311-ipywidgets \
python311-lz4 \
python311-numpy \
python311-pandas \
python311-traitlets \
python311-traittypes"

inherit rpm

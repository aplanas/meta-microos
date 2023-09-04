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

RPM_NAME = "python310-ipytablewidgets-0.3.1-2.1.noarch.rpm"
RPM_HASH = "fd03ccb15d82212ed8d47d6b8193435c49b89a59eaaa74636e1a951270639b3dbf980d8b46042854c0ae860abe64a3c436d6ac3a899eb7ff874dab4e2821d79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipytablewidgets \
python310-ipytablewidgets \
python3dist-ipytablewidgets"

RDEPENDS:${PN} += "python-abi \
python310-ipywidgets \
python310-lz4 \
python310-numpy \
python310-pandas \
python310-traitlets \
python310-traittypes"

inherit rpm

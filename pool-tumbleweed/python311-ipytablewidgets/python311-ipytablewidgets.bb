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

RPM_NAME = "python311-ipytablewidgets-0.3.1-1.3.noarch.rpm"
RPM_HASH = "ab5ca736e9d7b49227ce9537e52bb967fc8c43ec671e1aa5b61701c50b243f12753369df7e4656420ccde548ca9309e2ff8b4ee533f7fbbe732013ee9b714eda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipytablewidgets \
python3.11dist-ipytablewidgets \
python311-ipytablewidgets \
python3dist-ipytablewidgets"

RDEPENDS:${PN} += "python-abi \
python311-ipywidgets \
python311-lz4 \
python311-numpy \
python311-pandas \
python311-traitlets \
python311-traittypes"

inherit rpm

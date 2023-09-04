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

RPM_NAME = "python39-ipytablewidgets-0.3.1-2.1.noarch.rpm"
RPM_HASH = "db721ded9768a5c135b5330ada05d039b1223647b61db0890f2960eed3b82827095106dfdfc4e864fed6dbecaa374d8720fc13bc8e5469d662a7ecd0feb2403c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipytablewidgets \
python39-ipytablewidgets \
python3dist-ipytablewidgets"

RDEPENDS:${PN} += "python-abi \
python39-ipywidgets \
python39-lz4 \
python39-numpy \
python39-pandas \
python39-traitlets \
python39-traittypes"

inherit rpm

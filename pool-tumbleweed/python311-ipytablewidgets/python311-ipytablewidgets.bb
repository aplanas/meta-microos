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

RPM_NAME = "python311-ipytablewidgets-0.3.1-2.1.noarch.rpm"
RPM_HASH = "b06c2f167352bd15eaaa4d2b9d5ecc5b5d233538916a3c9b88cae0714209981efc6b4d1a3d0c43a92b4b06fcb6519260c1af0bd67cf91bcd686647ded423bbd8"
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

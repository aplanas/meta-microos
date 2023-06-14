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

RPM_NAME = "python310-ipytablewidgets-0.3.1-1.1.noarch.rpm"
RPM_HASH = "8817b0dfd62e643b44333cb9271295be4af14e683f1a82ff0e1060661f44889532a9b06a9ae55f434d9c0d68457b6a423a988abddf98b99df58dca281559f6cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipytablewidgets \
python3.10dist-ipytablewidgets \
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

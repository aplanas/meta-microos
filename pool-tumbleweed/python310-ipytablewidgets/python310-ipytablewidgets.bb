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

RPM_NAME = "python310-ipytablewidgets-0.3.1-1.3.noarch.rpm"
RPM_HASH = "b6ad21e7058ba82a1b7f91af52205b3eb7be1049082fb0f053b5c2cfb45e016c1ccfcc2f0095edaf06e45ca8c7295e80661ebdc64c79adc96bcfd6270b555de3"
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

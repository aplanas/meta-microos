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

RPM_NAME = "python39-ipytablewidgets-0.3.1-1.1.noarch.rpm"
RPM_HASH = "4b56cb963c905a2daeb133d63fffbdff5dae195e3c177c49ebbd13ed72de8d2924aed483d2fabbddb1cccdd32dd3ffa116ced96f8e6f8084e84ad1c2182470e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipytablewidgets) \
python39-ipytablewidgets \
python3dist(ipytablewidgets)"

RDEPENDS:${PN} += "python(abi) \
python39-ipywidgets \
python39-lz4 \
python39-numpy \
python39-pandas \
python39-traitlets \
python39-traittypes"

inherit rpm

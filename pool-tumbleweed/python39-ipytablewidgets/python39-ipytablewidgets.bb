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

RPM_NAME = "python39-ipytablewidgets-0.3.1-1.3.noarch.rpm"
RPM_HASH = "1b342552e360eb78fda791b473ebafb5e6695d5276680e1b25f76ac933cab73bc21a28f8001533f6010de263515c5d620e96a16015da188c1f3bde27cb47441b"
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

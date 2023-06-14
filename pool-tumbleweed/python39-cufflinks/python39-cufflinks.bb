SUMMARY = "Productivity Tools for Plotly + Pandas"
DESCRIPTION = "This library binds the plotly with pandas for plotting."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python39-cufflinks-0.17.3-3.8.noarch.rpm"
RPM_HASH = "85a61f019591a6c383543e09166384943dbb4a8cd6bcb3de78055373d53b699a175170940eca4d78ce882ed4f23c999a5d7487d2b168ab9f86221c72dbaab6b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cufflinks \
python39-cufflinks \
python3dist-cufflinks"

RDEPENDS:${PN} += "python-abi \
python39-colorlover \
python39-numpy \
python39-pandas \
python39-plotly \
python39-six"

inherit rpm

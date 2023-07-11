SUMMARY = "Library for collaborative, interactive, publication-quality graphs"
DESCRIPTION = "Use this package to make collaborative, interactive, \
publication-quality graphs from Python on https://plot.ly. \
 \
Plotly is an online collaborative data analysis and graphing tool. The \
Python API allows you to access all of Plotly's functionality from Python. \
Plotly figures are shared, tracked, and edited all online and the data is \
always accessible from the graph."
LICENSE = "MIT"

PV = "5.14.1"

RPM_NAME = "python311-plotly-5.14.1-1.2.noarch.rpm"
RPM_HASH = "4cab2175958c9bf098a4d9b1df2adbcd5a9c6ac9d2cbb7fa3e6e1019ad93edf91cc5dfd99976a359a4e33a8ff48256f9404b93a42b1d96c65224dea6528de578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plotly \
python3.11dist-plotly \
python311-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-tenacity"

inherit rpm

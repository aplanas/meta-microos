SUMMARY = "Library for collaborative, interactive, publication-quality graphs"
DESCRIPTION = "Use this package to make collaborative, interactive, \
publication-quality graphs from Python on https://plot.ly. \
 \
Plotly is an online collaborative data analysis and graphing tool. The \
Python API allows you to access all of Plotly's functionality from Python. \
Plotly figures are shared, tracked, and edited all online and the data is \
always accessible from the graph."
LICENSE = "MIT"

PV = "5.13.1"

RPM_NAME = "python310-plotly-5.13.1-1.3.noarch.rpm"
RPM_HASH = "0c957ef0c20917ed78cb2e4481d497e33b9063519a797f203b8bbabcd67bf2f76a2a703c59f3fe89c0d5c621c0df67b41bde9cf9ef3b53912e726419a3c57c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plotly \
python3.10dist-plotly \
python310-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "python-abi \
python310-tenacity"

inherit rpm

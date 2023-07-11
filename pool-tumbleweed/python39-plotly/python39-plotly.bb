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

RPM_NAME = "python39-plotly-5.14.1-1.2.noarch.rpm"
RPM_HASH = "e96c37ade3924ae8cea809d2e45be6c3814d2a86e6c091fd7b9f722fa98f42e73db5a64dcaecc08fe805856b427e6bad87f8a319de47a68791e4574e0da62054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-plotly \
python39-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-tenacity"

inherit rpm

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

RPM_NAME = "python310-plotly-5.14.1-1.2.noarch.rpm"
RPM_HASH = "32c1e6cea3ca03af0123f61758ca7a8a3099e3eb0b3a451d501d688d2b53aa72be3b545fcee1dbe2ad3b1e6c538f07f316ffb644f962b878d92a9d34141951a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-plotly \
python310-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-tenacity"

inherit rpm

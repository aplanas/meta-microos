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

RPM_NAME = "python39-plotly-5.13.1-1.3.noarch.rpm"
RPM_HASH = "4ee57155240dba0d080793a446f750d493ce1f7adf2f466c977cec031b149eb022497ac2ec8bbefad8b6d60f1ab21627bce3fc9724f62a2d83f15800be83820f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-plotly \
python39-plotly \
python3dist-plotly"

RDEPENDS:${PN} += "python-abi \
python39-tenacity"

inherit rpm

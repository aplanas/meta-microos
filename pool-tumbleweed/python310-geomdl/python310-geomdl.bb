SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python310-geomdl-5.3.1-2.4.noarch.rpm"
RPM_HASH = "cd883dd8b86c5c8b61aa29a3efeb8012b81994c79599d3280e8eab2d16784b720f89cd9d9d74792320f778d9ef23f6a5d6ca4a02f9e7c2308ce96eed22133ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geomdl \
python310-geomdl \
python3dist-geomdl"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-plotly"

inherit rpm

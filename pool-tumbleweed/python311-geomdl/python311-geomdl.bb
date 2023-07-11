SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python311-geomdl-5.3.1-2.4.noarch.rpm"
RPM_HASH = "40f2e820ed46d7ba20e5f49e90db3033ce0fd302a625eda73ce8d2473396a9228c0beea0d0704e588b229a44028078240cbe98dbff9e8200c4d474a620bb7aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geomdl \
python3.11dist-geomdl \
python311-geomdl \
python3dist-geomdl"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-plotly"

inherit rpm

SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python39-geomdl-5.3.1-2.4.noarch.rpm"
RPM_HASH = "d64dbf643b6afb36be8633fdac0ef27d5b30f88e8c9086c27d520cb11420932ca5d775baa89dcd6533c0d91ae0d2cc550dc4261c2ef0d1b48c175fb775caee67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geomdl \
python39-geomdl \
python3dist-geomdl"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy \
python39-plotly"

inherit rpm

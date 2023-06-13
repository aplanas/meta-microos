SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python39-geomdl-5.3.1-2.2.noarch.rpm"
RPM_HASH = "5e5fc300184ad207eb83a3f5aa79933e034c2b02003a39d34c417beb759b7dbcf88de5bcd2bb36fa99ff9c850a289154330a6ca660e173db7f3d56f86d6e85af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(geomdl) \
python39-geomdl \
python3dist(geomdl)"

RDEPENDS:${PN} += "python(abi) \
python39-matplotlib \
python39-numpy \
python39-plotly"

inherit rpm

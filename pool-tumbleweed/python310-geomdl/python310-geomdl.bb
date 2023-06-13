SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python310-geomdl-5.3.1-2.2.noarch.rpm"
RPM_HASH = "4aeeb40f5f9a7ac5ce78655ccc37e1aab1b2953a14e51f926b216bafc3f8057e1b364266e2c22579d5aa99929a4e6ead0e5c15fe62ced762a90889c67e1f7772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geomdl \
python3.10dist(geomdl) \
python310-geomdl \
python3dist(geomdl)"

RDEPENDS:${PN} += "python(abi) \
python310-matplotlib \
python310-numpy \
python310-plotly"

inherit rpm

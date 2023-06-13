SUMMARY = "Object-oriented B-Spline and NURBS evaluation library"
DESCRIPTION = "NURBS-Python (geomdl) is a pure Python, self-contained, object-oriented \
B-Spline and NURBS spline library."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python311-geomdl-5.3.1-2.2.noarch.rpm"
RPM_HASH = "f4f476ae39e344d42ba6147a245a6838d62fc5a02472e067730db445ddea06e8161744052fe21608e4230ff7e7ac42dc70c446b4ae7ad37d5d34f2fbc2fd2c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(geomdl) \
python311-geomdl \
python3dist(geomdl)"

RDEPENDS:${PN} += "python(abi) \
python311-matplotlib \
python311-numpy \
python311-plotly"

inherit rpm

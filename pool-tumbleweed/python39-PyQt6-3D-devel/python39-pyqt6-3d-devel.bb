SUMMARY = "Devel files for python39-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-3D-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "96282255b9cc8f6b6ea5dd52d1d8250b1d1192e8defefadc86c93a5bfe4c5ff645efd1a8034a1533e8117e949ae4244afe15cf37eddb4e5daa208d756444d28e"

RPROVIDES:${PN} += "python39-PyQt6-3D-devel \
python39-PyQt6-3D-devel(aarch-64)"

RDEPENDS:${PN} += "python39-PyQt6-devel"

inherit rpm

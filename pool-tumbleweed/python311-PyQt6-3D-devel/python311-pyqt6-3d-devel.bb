SUMMARY = "Devel files for python311-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-3D-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "833c79cab7412bad1e336a775093dbd3019381d0ad416868a4d6ef8880634e45882d07c735721be683530562eb0814380de574523a17c84ceb2ae8205d2d999e"

RPROVIDES:${PN} += "python311-PyQt6-3D-devel \
python311-PyQt6-3D-devel(aarch-64)"

RDEPENDS:${PN} += "python311-PyQt6-devel"

inherit rpm

SUMMARY = "Devel files for python39-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-3D-devel-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "c8060b346d87b4bfd5473f1c5094740331f53ff2342dd90431a7df05a31e7d39ba635617d3d1e7ab344f0a456cc57dae982f32d51fe8afaf62146d4e295ee528"

RPROVIDES:${PN} += "python39-PyQt6-3D-devel"

RDEPENDS:${PN} += "python39-PyQt6-devel"

inherit rpm

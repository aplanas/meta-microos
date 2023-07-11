SUMMARY = "Basic QA tests for the kernel"
DESCRIPTION = "This package is using the kernel compiled within Open Build Service(OBS) \
projects and runs basic tests."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-obs-qa-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "997e33a1e7feed791cd25d25ccc79cfd00d444efdbce8759e495026655d3a5e6c75e14530e492f2255f1c72414a22274ce95362e10e1e3a4123433e6b8ed4043"

RPROVIDES:${PN} += "kernel-obs-qa"

RDEPENDS:${PN} += ""

inherit rpm

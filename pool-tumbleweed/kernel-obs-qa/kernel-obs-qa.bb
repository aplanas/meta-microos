SUMMARY = "Basic QA tests for the kernel"
DESCRIPTION = "This package is using the kernel compiled within Open Build Service(OBS) \
projects and runs basic tests."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-obs-qa-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "2ae1e38f50d56be78b7fa10f0476e3d4ff316f37d56783c406cd15ff1b0400d08b68986dc9fcf1331c4bef443440a951136286e553d3e6d1d27740ae13532c89"

RPROVIDES:${PN} += "kernel-obs-qa"

RDEPENDS:${PN} += ""

inherit rpm

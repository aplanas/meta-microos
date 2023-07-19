SUMMARY = "Basic QA tests for the kernel"
DESCRIPTION = "This package is using the kernel compiled within Open Build Service(OBS) \
projects and runs basic tests."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-obs-qa-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "9c5fe0bbb56d11373ff8441fc9d598bad5304214cd7cdc3d79ee2aeb9dd669d602061fbc21805fb5f47c4081849b723005d0069578b0049add2c821762e6d696"

RPROVIDES:${PN} += "kernel-obs-qa"

RDEPENDS:${PN} += ""

inherit rpm

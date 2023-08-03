SUMMARY = "Basic QA tests for the kernel"
DESCRIPTION = "This package is using the kernel compiled within Open Build Service(OBS) \
projects and runs basic tests."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-obs-qa-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "6c15644bfef4ed6a6a2226c88da0751ea03812042752eed251596edb6b3889c6d4b051cd1c0caa382cb1158d65e3b4df29ab7fc52936df48c7604805e5cc5dd3"

RPROVIDES:${PN} += "kernel-obs-qa"

RDEPENDS:${PN} += ""

inherit rpm

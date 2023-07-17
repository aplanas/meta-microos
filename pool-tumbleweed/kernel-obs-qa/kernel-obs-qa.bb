SUMMARY = "Basic QA tests for the kernel"
DESCRIPTION = "This package is using the kernel compiled within Open Build Service(OBS) \
projects and runs basic tests."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-obs-qa-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "7e6de14671b4168ef01ae6ad32b17e2f8dfe0844e4db25d08ef8f91587ffab0d54ed8b895f5f4c0f8a7a9f36ea49cbeac727fe16b091206963213bc7bef21f0a"

RPROVIDES:${PN} += "kernel-obs-qa"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Basic QA tests for the kernel"
DESCRIPTION = "This package is using the kernel compiled within Open Build Service(OBS) \
projects and runs basic tests."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-obs-qa-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "13ca717094e15bd944b87bd02d89cc4bd09db07ee0845e6ab19f23cc4278afb38c5620b58957cb9b410158998c095d46c08aaa460ba4e8fcd165f0d889bdcae2"

RPROVIDES:${PN} += "kernel-obs-qa"

RDEPENDS:${PN} += ""

inherit rpm

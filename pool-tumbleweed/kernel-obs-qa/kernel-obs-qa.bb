SUMMARY = "Basic QA tests for the kernel"
DESCRIPTION = "This package is using the kernel compiled within Open Build Service(OBS) \
projects and runs basic tests."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-obs-qa-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "11283051a1401baa54a6ad4215fe45eab1bbb0af0bae23d9af516da398295725defc5c806df3c034231a42270e9a829f8afcd7857e10ee2517db9ed8c9ad11fb"

RPROVIDES:${PN} += "kernel-obs-qa"

RDEPENDS:${PN} += ""

inherit rpm

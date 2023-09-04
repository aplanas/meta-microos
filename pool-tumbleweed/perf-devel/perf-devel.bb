SUMMARY = "Development headers for perf"
DESCRIPTION = "Development headers for perf. This is currently only dlfilter header."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "perf-devel-6.4.11-81.1.aarch64.rpm"
RPM_HASH = "4dd4af7ad641f4661f90dd04f677fc2a9e989bbeb5977a340ab569c7161022e8d7ac472a1b548158068b276a73a5e88e92800f0b065157eb2bce55609dce7696"

RPROVIDES:${PN} += "perf-devel"

RDEPENDS:${PN} += "perf"

inherit rpm

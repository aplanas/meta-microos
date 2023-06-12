SUMMARY = "Dsh plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes from dsh-style 'group' files"
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-dshgroup-2.34-10.2.aarch64.rpm"
RPM_HASH = "653af6a8bbc4367e99c98d4747cea88bf6de9e921ba28b8ebcb766fcbaf3f1203dc29cca5b667ba71210adbc63cafed347e3a6909c8e8af757cd63fc03a7bb58"

RPROVIDES:${PN} += "pdsh-dshgroup \
pdsh-dshgroup(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
pdsh"

inherit rpm

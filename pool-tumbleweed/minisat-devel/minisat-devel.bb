SUMMARY = "Devel files for minisat"
DESCRIPTION = "Headers and libraries for the minisat package."
LICENSE = "MIT"

PV = "2.2.1+20200902"

RPM_NAME = "minisat-devel-2.2.1+20200902-3.4.aarch64.rpm"
RPM_HASH = "223143f55b86c3d177fdc9ef5d37acdfefa9bfc68cac3042ff5eff6c33bd7e406fabdc813ab4f57b45b027804b75d956e36fc2f6f21038c26510e20dbe86c4a7"

RPROVIDES:${PN} += "cmake(minisat) \
minisat-devel \
minisat-devel(aarch-64)"
RDEPENDS:${PN} += "libminisat2 \
zlib-devel"

inherit rpm

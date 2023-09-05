SUMMARY = "Dependency package for libsuperlu_6_0_1-gnu-hpc"
DESCRIPTION = "superlu: A general purpose library for the direct solution of linear equations \
The package libsuperlu-gnu-hpc provides the dependency to get binary package libsuperlu_6_0_1-gnu-hpc. \
When this package gets updated it installs the latest version of superlu_6_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "libsuperlu-gnu-hpc-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "37bdfd8291142024731f9f6378954eaaf54bf549fbd1997a348bbce24a08771e42c6348b6b92ee09118d6f8014cc4bf2718ab5229ec379e9ea958d0b525b6fe2"

RPROVIDES:${PN} += "libsuperlu-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libsuperlu-6-0-1-gnu-hpc"

inherit rpm

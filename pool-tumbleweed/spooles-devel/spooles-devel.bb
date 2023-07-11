SUMMARY = "Header files for the SPOOLES library"
DESCRIPTION = "spooles-devel provides the header file for the SPOOLES library."
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "spooles-devel-2.2-1.5.aarch64.rpm"
RPM_HASH = "2397d34667a24926bf9361066c76f9d15a6cdc7bc94887804b4c6e84911781c3ca826014abbe1bea5d7dc05c91f7f5320e05e0f52ecd7f0dafcdfca7de54c99d"

RPROVIDES:${PN} += "spooles-devel"

RDEPENDS:${PN} += "libspooles2-2"

inherit rpm

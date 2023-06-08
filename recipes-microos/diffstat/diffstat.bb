SUMMARY = "Utility That Provides Statistics Based on the Output of diff"
DESCRIPTION = "diffstat reads the output of the diff command and displays a histogram \
of the insertions, deletions, and modifications in each file."
LICENSE = "MIT"

PV = "1.65"

RPM_NAME = "diffstat-1.65-1.2.aarch64.rpm"
RPM_HASH = "8d236f153722a5ec6c1bdee09175852f11b6ada231a3c5e58fe1bb84940f22fe18823de517e4a9f35b1f6a26a39b1c52dd81a5e074e85214aa5f08005b3c9586"

RPROVIDES:${PN} += "diffstat diffstat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

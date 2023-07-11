SUMMARY = "A library for run-time tuning of process binding policies"
DESCRIPTION = "QUO is an API tailored for MPI/MPI+X codes that may benefit from \
evolving process binding policies during their execution. QUO allows \
for arbitrary process binding policies to be enacted and reverted \
during the execution as different computational phases are entered \
and exited, respectively."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libquo7-1.3.1-2.10.aarch64.rpm"
RPM_HASH = "178aaf3482f81e51bd873168cfb3c6b9691e174ffeef142ab892064f0b328f69d8f5b7fd4319f1fb636a35adad93c5b7bc37ee5efc6ded648249f324b2a4680a"

RPROVIDES:${PN} += "libquo.so.7 \
libquo7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40"

inherit rpm

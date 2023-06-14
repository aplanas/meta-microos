SUMMARY = "A library for run-time tuning of process binding policies"
DESCRIPTION = "QUO is an API tailored for MPI/MPI+X codes that may benefit from \
evolving process binding policies during their execution. QUO allows \
for arbitrary process binding policies to be enacted and reverted \
during the execution as different computational phases are entered \
and exited, respectively."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libquo7-1.3.1-2.9.aarch64.rpm"
RPM_HASH = "ee64000d21161f6b05ccfe1fc83e7980f84513bf2124e759a5b56d95aafeee7e8e0635a1691f5a233dcdae953a83d026fe4f8d3e451fb7a9bb84a1842a716e78"

RPROVIDES:${PN} += "libquo.so.7 \
libquo7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40"

inherit rpm

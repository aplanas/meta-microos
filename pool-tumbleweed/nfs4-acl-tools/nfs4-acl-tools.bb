SUMMARY = "Command line tools for managing ACLs over NFSv4"
DESCRIPTION = "Command line tools for viewing and setting ACLs (Access Control Lists) \
when using NFSv4 to access a remote filesystem. The remote filesystem \
must also support ACLs."
LICENSE = "BSD-3-Clause"

PV = "0.3.7"

RPM_NAME = "nfs4-acl-tools-0.3.7-2.7.aarch64.rpm"
RPM_HASH = "6638351da0ac8b0c5f87ad72c3809ef24f6dde2c8dd0de61794c7e4c07c0e3e23a08d9952713881ceaf541e4d9251c699313ee1eac4c16402d6001405968e92e"

RPROVIDES:${PN} += "nfs4-acl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

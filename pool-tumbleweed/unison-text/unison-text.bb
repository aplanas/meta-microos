SUMMARY = "File synchronization tool"
DESCRIPTION = "Text based userinterface for Unison. \
 \
Unison is a file synchronization tool for Unix and Windows. It allows \
two replicas of a collection of files and directories to be stored on \
different hosts (or different disks on the same host), modified \
separately, then brought up to date by propagating the changes in each \
replica to the other."
LICENSE = "GPL-3.0+"

PV = "2.53.3"

RPM_NAME = "unison-text-2.53.3-1.1.aarch64.rpm"
RPM_HASH = "43bcd83609e668840e3fd73916537bd626d75c0e185f9cd0719c6e153dc00b788b1e4aa538afa04f5c13e8522d75ffd61b5a034ece32c49fb62224f2a12a224d"

RPROVIDES:${PN} += "unison-text"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm

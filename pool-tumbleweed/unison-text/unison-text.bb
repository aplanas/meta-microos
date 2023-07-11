SUMMARY = "File synchronization tool"
DESCRIPTION = "Text based userinterface for Unison. \
 \
Unison is a file synchronization tool for Unix and Windows. It allows \
two replicas of a collection of files and directories to be stored on \
different hosts (or different disks on the same host), modified \
separately, then brought up to date by propagating the changes in each \
replica to the other."
LICENSE = "GPL-3.0+"

PV = "2.53.2"

RPM_NAME = "unison-text-2.53.2-1.2.aarch64.rpm"
RPM_HASH = "59e9a3a4b9a3a13c76ef0d2ab070d0338a6536a20af3818e15ac0d8e88ba19646221b96cd34d77666594f12acfcb2d0ac025b68943defde1034fbe6d3d79ae94"

RPROVIDES:${PN} += "unison-text"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm

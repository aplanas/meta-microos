SUMMARY = "File synchronization tool"
DESCRIPTION = "Graphical userinterface for Unison. \
 \
Unison is a file synchronization tool for Unix and Windows. It allows \
two replicas of a collection of files and directories to be stored on \
different hosts (or different disks on the same host), modified \
separately, then brought up to date by propagating the changes in each \
replica to the other."
LICENSE = "GPL-3.0+"

PV = "2.53.2"

RPM_NAME = "unison-2.53.2-1.1.aarch64.rpm"
RPM_HASH = "59328ea145a20f94e0895caf2ae9c5ce9a34c04eb2cef9d16cfe9ec40958951d37dea202628d4415fe535938021f7311257f922827dc56fde4b452cc98fce9ef"

RPROVIDES:${PN} += "unison"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm

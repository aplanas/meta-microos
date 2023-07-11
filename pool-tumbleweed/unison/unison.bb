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

RPM_NAME = "unison-2.53.2-1.2.aarch64.rpm"
RPM_HASH = "f58a62133a66e9caf30b67dc3041e063be8c8787b5d78110e95f6c92faa135759710ddaa9af102c9ddcc72750836bbb685b9e92cda3518cf8e193b6fad194043"

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

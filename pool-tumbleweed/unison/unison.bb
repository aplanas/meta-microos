SUMMARY = "File synchronization tool"
DESCRIPTION = "Graphical userinterface for Unison. \
 \
Unison is a file synchronization tool for Unix and Windows. It allows \
two replicas of a collection of files and directories to be stored on \
different hosts (or different disks on the same host), modified \
separately, then brought up to date by propagating the changes in each \
replica to the other."
LICENSE = "GPL-3.0+"

PV = "2.53.3"

RPM_NAME = "unison-2.53.3-1.1.aarch64.rpm"
RPM_HASH = "3109e23079ea75f77008bf69a4e2342fec06a33a30fc0697143127cffb9adc67447516c5bac2fbee137e91ed56108f5b1f536f4935b4249416ae7049d23e71c2"

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

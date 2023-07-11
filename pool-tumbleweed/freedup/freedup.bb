SUMMARY = "Links substantially identical, duplicate files to save file system space"
DESCRIPTION = "Freedup eliminates duplicate files by linking them, and thus reduces the amount \
of used disk space within one or more file systems. By default, hardlinks are \
used on a single device, symbolic links when the devices differ. A set of \
options allows you to modify the methods of file comparison, the hash functions, \
the linking behavior, and the reporting style. You may use batch or interactive \
mode. Freedup usually only considers identical files, but when comparing audio \
or graphics files, you may elect to ignore the tags. Multimedia files often are \
a good target for deduplication."
LICENSE = "GPL-3.0+"

PV = "1.6~3"

RPM_NAME = "freedup-1.6~3-2.26.aarch64.rpm"
RPM_HASH = "5f51e74672b149810905c844b2da611d944ebaced88bb6719d7f650ffbf2a5da6a3132ef29e4b2698975f19db1c5027dbdeeab74034caea11e21a4ef81ce618a"

RPROVIDES:${PN} += "freedup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

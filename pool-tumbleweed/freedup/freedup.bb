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

RPM_NAME = "freedup-1.6~3-2.25.aarch64.rpm"
RPM_HASH = "351d9aa7dc25465754983ef9f2d3c7308150e9472ec648157f743eec8e7a7f03848ac32a029c13bd30967f17a0a57b3c42b51217298e5045bdf34a25ab5fff69"

RPROVIDES:${PN} += "freedup \
freedup(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

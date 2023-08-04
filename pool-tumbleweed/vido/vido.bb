SUMMARY = "Online Video Downloader"
DESCRIPTION = "This tool downloads online videos from various sources including \
archive.org and others."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-2.3.0-1.15.aarch64.rpm"
RPM_HASH = "b16ef450f9353f03321145f2b1fc5fc84d103a908ebf39b8cb1a477a5b5c9153726dbbad8e3fa73ce20b28b909f48175b3f5096720a0e7432d996bee73998f3d"

RPROVIDES:${PN} += "vido"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0 \
youtube-dl"

inherit rpm

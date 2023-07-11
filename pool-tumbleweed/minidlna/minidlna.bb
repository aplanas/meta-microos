SUMMARY = "DLNA compatible server"
DESCRIPTION = "MiniDLNA (aka ReadyDLNA) is server software with the aim of being fully \
compliant with DLNA/UPnP-AV clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "minidlna-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "9d5de65804ec8b2ac5bce4084cb6ade145aa9595e92bae0954e6526a5b4c4709e8349c7fa273fd89a512120195ad835eec51245d7a87785bfacc4d865e3e50e2"

RPROVIDES:${PN} += "ReadyMedia \
config-minidlna \
group-minidlna \
minidlna \
user-minidlna"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libexif.so.12 \
libid3tag.so.0.16.2 \
libjpeg.so.8 \
libogg.so.0 \
libsqlite3.so.0 \
libvorbis.so.0 \
sysuser-shadow"

inherit rpm

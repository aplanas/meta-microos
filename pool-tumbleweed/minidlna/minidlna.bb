SUMMARY = "DLNA compatible server"
DESCRIPTION = "MiniDLNA (aka ReadyDLNA) is server software with the aim of being fully \
compliant with DLNA/UPnP-AV clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "minidlna-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "f069dce9a176262b1fe16183499290fb2a0e505d12d55a8e9908efe3544fced11e5ce3a2953bd36bd8d839470ef061004e3f0923f384f091fd162b8c4d2cc323"

RPROVIDES:${PN} += "ReadyMedia \
config-minidlna \
group-minidlna \
minidlna \
user-minidlna"

RDEPENDS:${PN} += "/bin/sh \
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

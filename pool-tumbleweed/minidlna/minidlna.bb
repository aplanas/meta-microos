SUMMARY = "DLNA compatible server"
DESCRIPTION = "MiniDLNA (aka ReadyDLNA) is server software with the aim of being fully \
compliant with DLNA/UPnP-AV clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "minidlna-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "8c23d9f4939459a7a19dd086d9efa73efcaae8f5cf6d9d30f7d0bb7af4b6cb99bc97cfa32f4bd6d318c04d24f024b69726cc6816fbd119c8e300ee5517b92ae1"

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

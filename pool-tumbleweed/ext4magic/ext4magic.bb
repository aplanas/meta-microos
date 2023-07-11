SUMMARY = "Tool for recovering deleted files on ext3/4 filesystems"
DESCRIPTION = "ext4magic is a tool which can help recover accidentally deleted or \
overwritten files from ext3 or ext4 file systems. Especially private \
computers may lack an adequate, frequent or reliable backup."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.2"

RPM_NAME = "ext4magic-0.3.2-4.18.aarch64.rpm"
RPM_HASH = "51b1f921a3120e141d51f0f61d3d9b1593027644da942d559ceaf139c83e26650853c3e15a8b31a10848ad4dac93f039a018718ee08d4f33095485f96afc2918"

RPROVIDES:${PN} += "ext4magic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libe2p.so.2 \
libext2fs.so.2 \
libmagic.so.1 \
libuuid.so.1 \
libz.so.1"

inherit rpm

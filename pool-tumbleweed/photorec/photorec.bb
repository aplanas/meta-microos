SUMMARY = "Tool to Undelete Files"
DESCRIPTION = "PhotoRec is a file data recovery software designed to recover lost files \
including video, documents and archives from hard disks and CD Rom and lost \
pictures (Photo Recovery) from digital camera memory. PhotoRec ignores the \
filesystem and goes after the underlying data, so it works even if your media's \
filesystem is severely damaged or reformatted."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "photorec-7.1-4.13.aarch64.rpm"
RPM_HASH = "472fb131ec6ac9eecb0539ab008fb990ab8aac602f5a0ac11e4b2544d104eb3fd73a8c06a8cb6c942e8864ebf760e97e8a106c3ec1c65d44412932b436591d0b"

RPROVIDES:${PN} += "photorec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libewf.so.3 \
libext2fs.so.2 \
libjpeg.so.8 \
libncursesw.so.6 \
libntfs-3g.so.89 \
libtinfo.so.6 \
libz.so.1"

inherit rpm

SUMMARY = "Tool to Undelete Files"
DESCRIPTION = "PhotoRec is a file data recovery software designed to recover lost files \
including video, documents and archives from hard disks and CD Rom and lost \
pictures (Photo Recovery) from digital camera memory. PhotoRec ignores the \
filesystem and goes after the underlying data, so it works even if your media's \
filesystem is severely damaged or reformatted."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "photorec-7.1-4.15.aarch64.rpm"
RPM_HASH = "de0a6b7b406100a9c24f659b588d82ec9794414c20df6650c8faf6d87b87ad363eae7b70c78636c159027aecc939f3c5dd116167bc6f54ac91e22a6b766ffa43"

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

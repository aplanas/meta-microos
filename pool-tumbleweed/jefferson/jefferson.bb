SUMMARY = "JFFS2 filesystem extraction tool"
DESCRIPTION = "A JFFS2 filesystem extraction tool written in python. \
 \
Features: \
 - Big/Little Endian support \
 - JFFS2_COMPR_ZLIB, JFFS2_COMPR_RTIME, and \
   JFFS2_COMPR_LZMA compression support \
 - CRC checks - for now only enforced on hdr_crc \
 - Extraction of symlinks, directories, files, and device nodes \
 - Detection/handling of duplicate inode numbers. Occurs if multiple \
   JFFS2 filesystems are found in one file and causes jefferson \
   to treat segments as separate filesystems"
LICENSE = "MIT"

PV = "0.4.1+git.20220705"

RPM_NAME = "jefferson-0.4.1+git.20220705-1.3.noarch.rpm"
RPM_HASH = "cadb9d8505153b37d4b065728659629dc843d96631051fe1315fb2cfed2cffb4095a8584420654d1c8744edc9a6b0343457f89aa3aa9bf6bb0d11fe9ca6be73c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jefferson \
python3.10dist-jefferson \
python3dist-jefferson"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cstruct \
python3-pylzma"

inherit rpm

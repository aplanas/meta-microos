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

RPM_NAME = "jefferson-0.4.1+git.20220705-1.4.noarch.rpm"
RPM_HASH = "2250671881cdd5be00ebe98aca75d920684419dae1dec6ff7c6627f2c92a0c838060e3064e43c83476187bfda656aa77fd401865771f5e77505fbb3ed1466715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jefferson \
python3.11dist-jefferson \
python3dist-jefferson"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cstruct \
python3-pylzma"

inherit rpm

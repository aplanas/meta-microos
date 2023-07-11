SUMMARY = "Intelligent Archive Extraction Tool"
DESCRIPTION = "dtrx stands for 'Do The Right Extraction'. It is a tool for Unix-like \
systems for extracting different archive formats. \
 \
Features: \
* Support for many archive types, including tar, zip, cpio, deb, rpm, \
  gem, 7z, cab, gz, bz2, and lzma files. Extra compression like \
  .tar.bz2 is recognized. \
* Archives are extracted into their own dedicated directories. \
* All extracted files can be read and written, while leaving the rest \
  of the permissions intact. \
* dtrx can find archives inside the archive and extract those too."
LICENSE = "GPL-3.0-only"

PV = "8.5.2"

RPM_NAME = "dtrx-8.5.2-2.2.noarch.rpm"
RPM_HASH = "0fe5de537be425ecafeca313faa49f975aa3f840be659b964946cf0db08abf14a3f915d6ef22767f0f55dc0f38d67f8fc38a3b9450080b0b94c596d4defbfde1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtrx \
python3.11dist-dtrx \
python3dist-dtrx"

RDEPENDS:${PN} += "/usr/bin/python3 \
bzip2 \
cpio \
gzip \
python-abi \
tar \
unzip"

inherit rpm

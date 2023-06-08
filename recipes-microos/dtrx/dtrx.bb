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

RPM_NAME = "dtrx-8.5.2-2.1.noarch.rpm"
RPM_HASH = "cf9bbc9af5ca5a2abe69b8129510fa95efa5e932c319b1adc7cdd84b81a169fd94ae8ac7ee2406cc42f12859e051cca8f614367c391217fcd730d5e104ef9805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtrx python3.10dist(dtrx) python3dist(dtrx)"
RDEPENDS:${PN} += "/usr/bin/python3 bzip2 cpio gzip python(abi) tar unzip"

inherit rpm

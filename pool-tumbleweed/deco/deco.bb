SUMMARY = "Deco Archive File Extractor"
DESCRIPTION = "deco is a generic archive file extractor that has a consistent command line \
interface ('deco 1.tar.bz2 2.zip 3.flac 4.rar 5.deb' will just work) and \
consistent behavior (it never deletes archives after extraction, extracts \
relative to the current working directory, and extracts just verbosely enough, \
all unless explicitly requested otherwise). It provides automatic handling of \
extractor gotchas by creating an extraction directory if there is more than \
one file or directory at the archive top level and by being able to fix \
strange permissions. 33 archive file extensions are supported out of the box, \
and adding support for others requires very little work."
LICENSE = "GPL-3.0-only"

PV = "1.6.4"

RPM_NAME = "deco-1.6.4-1.12.aarch64.rpm"
RPM_HASH = "91b8e4f58535143db1858edf4d5dc6610b240e9f618eb52ae0d215a24740effe11a2f37a6d816711b3499d391d60eb7499496fdf140ff22e63db20668d16bc99"

RPROVIDES:${PN} += "deco"

RDEPENDS:${PN} += "bzip2 \
gzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
tar"

inherit rpm

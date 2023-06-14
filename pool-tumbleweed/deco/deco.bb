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

RPM_NAME = "deco-1.6.4-1.11.aarch64.rpm"
RPM_HASH = "b927c3ca59e61e369952179a8f2c7656ed72ee8d002e4b270cecac2e37f1dfc184ee2169d6c3e234a6ecfe728731fae8fbee562ee4ca3486c1409ffeb24cc0e3"

RPROVIDES:${PN} += "deco"

RDEPENDS:${PN} += "bzip2 \
gzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
tar"

inherit rpm

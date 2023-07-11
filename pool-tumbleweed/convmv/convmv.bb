SUMMARY = "Utility to convert file names between encodings"
DESCRIPTION = "convmv is meant to convert the filenames in a directory tree or a \
whole file system into a different encoding, with support for \
symlinks. \
 \
This is useful for converting from old 8-bit locales to UTF-8. It is \
also possible to convert directories to UTF-8 that are already partly \
UTF-8 encoded. \
 \
convmv can convert names to both the NFC and NFD normalization forms. \
NFC is commonly used on Linux and (most?) other Unix-like OSes, \
though it does not enforce it. Darwin, the base of Macintosh OS X, \
enforces Normalization Form Canonical Decomposition (NFD)."
LICENSE = "GPL-2.0-or-later"

PV = "2.05"

RPM_NAME = "convmv-2.05-2.14.noarch.rpm"
RPM_HASH = "9f75a81dcff9fa4c0050eae6eb92c5bb02942f5c0d818eba4146a940957af43264cf92b00c4c3dc742a8df6b9804792f44228ba4314637a6701072bdfefdedc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "convmv"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm

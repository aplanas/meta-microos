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

RPM_NAME = "convmv-2.05-2.13.noarch.rpm"
RPM_HASH = "ca622981a191f6b49cb3dac98433ec59d4a3affe964c76772d62d7c190905f5ec2afeb94657d248deff9dfd53c5a130b6bb520596feaf7b1c719abd369e3bbec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "convmv"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm

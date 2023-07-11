SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-zlib1-1.2.13-2.2.noarch.rpm"
RPM_HASH = "dfc6eaa3e23ec20e76767b98032186fbac928d494df80df0a0893594f3ca8f1bddaa242d479bb7eaaea8ea25a733796aebba5debb011a2ece71360addced241b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-zlib \
mingw64-zlib1"

RDEPENDS:${PN} += ""

inherit rpm

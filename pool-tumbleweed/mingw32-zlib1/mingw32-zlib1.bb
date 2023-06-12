SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-zlib1-1.2.13-3.1.noarch.rpm"
RPM_HASH = "3a80cdaae172b059dba42469f99cb36e652dac98ba8aca41db3718954815bce0a3ad3e04ffd670a6b2b994eb42523526f27b2d23ea804f8ecd2c585294aded1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-zlib \
mingw32-zlib1"
RDEPENDS:${PN} += ""

inherit rpm

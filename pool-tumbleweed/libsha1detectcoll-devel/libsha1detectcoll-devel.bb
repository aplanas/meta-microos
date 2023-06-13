SUMMARY = "Development files for"
DESCRIPTION = "This library was designed as near drop-in replacements for other sha1sum \
implementations. It will compute the SHA-1 hash of any given file and additionally \
will detect cryptanalytic collision attacks against SHA-1 present in each file. \
It is very fast and takes less than twice the amount of time as regular SHA-1."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libsha1detectcoll-devel-1.0.3-4.20.aarch64.rpm"
RPM_HASH = "faec6cc26599d156a2083fb8d26561db325ae145d49dc8d7fbc326ea90b839672b0cfe37021cff3296d51fb1fc541abce186b00e550e12f8e7216c1193fe3096"

RPROVIDES:${PN} += "libsha1detectcoll-devel \
libsha1detectcoll-devel(aarch-64)"

RDEPENDS:${PN} += "libsha1detectcoll1"

inherit rpm

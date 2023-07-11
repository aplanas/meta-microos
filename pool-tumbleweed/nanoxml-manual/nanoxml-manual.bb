SUMMARY = "Manual for nanoxml"
DESCRIPTION = "Documentation for nanoxml, a small non-validating XML parser."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-manual-2.2.3-4.7.noarch.rpm"
RPM_HASH = "eaba7d82ef66fe30da85e38a192d184e11dd2acd1cfb284fc386dc0c81f9d7bbca750434822859461b1d5543cabe9c87c0636712cf7c638eadfadccd9b24dcbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-manual"

RDEPENDS:${PN} += ""

inherit rpm

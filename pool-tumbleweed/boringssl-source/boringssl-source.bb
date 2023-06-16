SUMMARY = "Source code of BoringSSL"
DESCRIPTION = "Source files for BoringSSL implementation"
LICENSE = "OpenSSL"

PV = "20200921"

RPM_NAME = "boringssl-source-20200921-2.7.noarch.rpm"
RPM_HASH = "9fdef4a35d453629efc8f3f74afcd348ba98acc0cbf495c25288e3803e337c05a5ce26f4eb2d0c5ad85b75a07bcbd01e63b82db8066ff450278d27f0fbda3183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boringssl-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm

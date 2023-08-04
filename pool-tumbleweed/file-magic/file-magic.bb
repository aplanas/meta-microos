SUMMARY = "Database for libmagic to help identify files"
DESCRIPTION = "This package contains the basic magic files that libmagic reads and uses \
to estimate a file's type."
LICENSE = "BSD-2-Clause"

PV = "5.45"

RPM_NAME = "file-magic-5.45-1.1.noarch.rpm"
RPM_HASH = "a8fa2dc3a4be0b4f7939a04e47bffbd72c58f130640c68a461595cbd57883504696ccdc3c4dcc3171e510b3d254bfc8cd299592f8592e20d9f03b059ee5bbc51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-file-magic \
file-magic \
libmagic-data"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Database for libmagic to help identify files"
DESCRIPTION = "This package contains the basic magic files that libmagic reads and uses \
to estimate a file's type."
LICENSE = "BSD-2-Clause"

PV = "5.44"

RPM_NAME = "file-magic-5.44-2.1.noarch.rpm"
RPM_HASH = "1e6e2de3f631e43ad4eded145e38a663b3b7f44cfaa1fd666a775b7c1b59ce57288d5e6e6705d6c7d6b05525fd10e68c1859ab4188ffbe62b5e09fe63315f98d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(file-magic) \
file-magic \
libmagic-data"

RDEPENDS:${PN} += ""

inherit rpm

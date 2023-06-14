SUMMARY = "Library for reading/writing quicktime movie files"
DESCRIPTION = "library for reading/writing quicktime movie files, based on and forked \
from quicktime4linux"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-devel-1.2.4+git20180804.fff99cd-4.1.aarch64.rpm"
RPM_HASH = "4b105ad718d821ba945f4af34863a6197533f936b0a3a29e51f30169687dad6186871148c048aa6ddfddeae9f7ee2a225cef1b3957f584ac13792aae9f3582eb"

RPROVIDES:${PN} += "libquicktime-devel \
pkgconfig-libquicktime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libquicktime \
libquicktime0"

inherit rpm

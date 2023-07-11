SUMMARY = "Development files for libmagic, a library to determine file types"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require the magic 'file' interface."
LICENSE = "BSD-2-Clause"

PV = "5.44"

RPM_NAME = "file-devel-5.44-2.3.aarch64.rpm"
RPM_HASH = "3244218bbea4f937b407212f8475195693b97696cefb5f50a049bd3ce9c7c59b0c764caf370ffbfa6b6beace47c47c4ab2cf8b487c608be0502b9b139d134a0a"

RPROVIDES:${PN} += "file-/usr/include/magic.h \
file-devel \
pkgconfig-libmagic"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmagic1"

inherit rpm

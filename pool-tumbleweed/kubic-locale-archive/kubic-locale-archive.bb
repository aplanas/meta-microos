SUMMARY = "Minimal locale archive for very small systems"
DESCRIPTION = "This package contains a glibc locale archive with the C.UTF-8 and \
en_US.UTF-8 locale for very minimal systems only supporting \
english as locale."
LICENSE = "GPL-2.0+ & MIT & LGPL-2.1+"

PV = "2.38"

RPM_NAME = "kubic-locale-archive-2.38-3.17.noarch.rpm"
RPM_HASH = "6465f914dbd8f3fff80ea6baf9f3b1ac705f2ecf4901691a886eeb959b19633981b3071014d9123eebd210f3f31b72bd8f075d73a940fa3014aebff5718f35f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubic-locale-archive"

RDEPENDS:${PN} += "glibc"

inherit rpm

SUMMARY = "Translation of man pages in Greek"
DESCRIPTION = "This package provides translations of man pages in Greek."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-el-4.20.0-1.1.noarch.rpm"
RPM_HASH = "6615960f578ec9886ba3e13a75e38a2372d1787ab71c1c631c0011afc2db3caede65e655fbeab6e351d5dd0809d0530ba1cf63d26f40d70eaf1a130fddde88fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-el \
man-pages-el"

RDEPENDS:${PN} += "man-pages"

inherit rpm

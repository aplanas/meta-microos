SUMMARY = "Info Files for the GNU C Library"
DESCRIPTION = "This package contains the documentation for the GNU C library stored as \
info files. Due to a lack of resources, this documentation is not \
complete and is partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.37"

RPM_NAME = "glibc-info-2.37-4.1.noarch.rpm"
RPM_HASH = "a322cfbf91f1f6e108df7022b0e2ac0ae947a12278d8bb8cba48cdb26eac71272141c31c216901be6de917cfa60f01d16389893944f436f98149f361dda98c4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

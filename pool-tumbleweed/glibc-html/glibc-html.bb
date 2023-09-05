SUMMARY = "HTML Documentation for the GNU C Library"
DESCRIPTION = "This package contains the HTML documentation for the GNU C library. Due \
to a lack of resources, this documentation is not complete and is \
partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.38"

RPM_NAME = "glibc-html-2.38-2.1.noarch.rpm"
RPM_HASH = "b777942bdf3180a7b78ececfe9c6efe39396e5512aa3bbce01e88dc52a425acad5db763c41fb6b8ee581f170163162aa4ed1b2d0230b34e7b08d690f88cb42ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-html"

RDEPENDS:${PN} += ""

inherit rpm

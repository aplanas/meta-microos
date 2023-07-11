SUMMARY = "HTML Documentation for the GNU C Library"
DESCRIPTION = "This package contains the HTML documentation for the GNU C library. Due \
to a lack of resources, this documentation is not complete and is \
partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.37"

RPM_NAME = "glibc-html-2.37-4.4.noarch.rpm"
RPM_HASH = "2cbf56d9e5bfad9ea7a48a1a21b9fc613a99722d141c1bae758f2a4c577fc947d3d56e38de03d7674fea5e1fe03b1fc8d0dc277010b13f98309f383a5620f7cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-html"

RDEPENDS:${PN} += ""

inherit rpm

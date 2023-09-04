SUMMARY = "HTML Documentation for the GNU C Library"
DESCRIPTION = "This package contains the HTML documentation for the GNU C library. Due \
to a lack of resources, this documentation is not complete and is \
partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.38"

RPM_NAME = "glibc-html-2.38-1.1.noarch.rpm"
RPM_HASH = "54d7c731c362e8b2d4760aeea91534ef552e4723d575e61fcaddecf88a2c3b219644a95c1bf5f8f73ef1ce5871cd594950fea78bb2a8d950fe8b9d14fc755da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-html"

RDEPENDS:${PN} += ""

inherit rpm

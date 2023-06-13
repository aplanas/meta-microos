SUMMARY = "Javadoc for gnu.getopt"
DESCRIPTION = "The GNU Java getopt classes support short and long argument parsing in \
a manner 100% compatible with the version of GNU getopt in glibc 2.0.6 \
with a mostly compatible programmer's interface as well. Note that this \
is a port, not a new implementation. \
 \
This package contains the javadoc documentation for the GNU Java getopt \
classes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.14"

RPM_NAME = "gnu-getopt-javadoc-1.0.14-1.13.noarch.rpm"
RPM_HASH = "6c9dddb8c9130f3777b2200d1d0aaafaf67af96a9dfe536a18641dd51eb2145480efe88dbca88a8fb1d88a4ecc1900891326331b1a0be577649909f687f81d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-getopt-javadoc"

RDEPENDS:${PN} += ""

inherit rpm

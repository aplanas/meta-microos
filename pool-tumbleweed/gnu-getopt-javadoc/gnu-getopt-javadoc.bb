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

RPM_NAME = "gnu-getopt-javadoc-1.0.14-1.14.noarch.rpm"
RPM_HASH = "4535af7a9c6c503847ece63d415398f92e02acb58700ee3cdc3b88103172c08026f103e4313a2a7b885aef2f8d8a6afdd7e409c11f9eb46fd0a787b7c3d80f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-getopt-javadoc"

RDEPENDS:${PN} += ""

inherit rpm

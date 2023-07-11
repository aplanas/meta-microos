SUMMARY = "Development documentation for libdbi"
DESCRIPTION = "The libdbi-devel-doc package contains libdbi programmers-guide \
and driver-guide."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0.g33"

RPM_NAME = "libdbi-devel-doc-0.9.0.g33-4.10.noarch.rpm"
RPM_HASH = "a09b6f975aeaabca0a52e9e7f9ce1cd5348a04a689283db4833a2819475aedc54f6ff933e93736e4cd613448de6ce80c4b7297719f93c9d94c719810569a56f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbi-devel-/usr/share/doc/packages/libdbi/driver-guide.pdf \
libdbi-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Development files for blueprint-compiler"
DESCRIPTION = "A markup language for GTK user interface files."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "blueprint-compiler-devel-0.6.0-1.2.noarch.rpm"
RPM_HASH = "abe3f21053fb41d709c9f0159ea798d2794161c353a4eb354de6d578895d8a06315c0a49565af89817f00a25b8caeecb72c00b804c54f1baa247251baf1b3995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueprint-compiler-devel \
pkgconfig-blueprint-compiler"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
blueprint-compiler"

inherit rpm

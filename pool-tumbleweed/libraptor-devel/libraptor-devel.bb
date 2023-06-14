SUMMARY = "Development package for the raptor library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
raptor library."
LICENSE = "LGPL-2.1-or-later | GPL-2.0-or-later | Apache-2.0"

PV = "2.0.15"

RPM_NAME = "libraptor-devel-2.0.15-3.18.aarch64.rpm"
RPM_HASH = "600a05cbba5023eb42791769521d824efa9d78eafa5a339bbb96a7d019b5e3baf8470f59941fc5dc946d3cbd67a27aebaebf0fa7dfe797dca000d07d82b17b37"

RPROVIDES:${PN} += "libraptor-devel \
pkgconfig-raptor2 \
raptor-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libraptor2-0 \
raptor"

inherit rpm

SUMMARY = "The development files for libconfuse"
DESCRIPTION = "libConfuse is a configuration file parser library. It supports \
sections and (lists of) values (strings, integers, floats, booleans \
or other sections), as well as single/double-quoted strings, \
environment variable expansion, functions and nested include \
statements. \
 \
This package holds the development files for libconfuse."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3"

RPM_NAME = "libconfuse-devel-3.3-2.3.aarch64.rpm"
RPM_HASH = "847c1cd8de988dd8318ad136adf0e3636951f048c211c202f56df54b88a02853bbbd83a76511a3233767e859baaae94d31824cffd2cbf85bf4c2c5d574110396"

RPROVIDES:${PN} += "libconfuse-devel \
pkgconfig-libconfuse"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libconfuse2"

inherit rpm

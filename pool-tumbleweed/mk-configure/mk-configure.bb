SUMMARY = "A build system on top of bmake"
DESCRIPTION = "mk-configure is a collection of include files for bmake (portable version of \
NetBSD make) and a number of executables. It is intended to aid cross-platform \
development and software building."
LICENSE = "BSD-2-Clause & MIT & ISC"

PV = "0.38.2"

RPM_NAME = "mk-configure-0.38.2-1.2.noarch.rpm"
RPM_HASH = "926a3610fd442651e31e417cff55e5ffc7b3678f40dba240e154022a695d83f2707550026698f1542d24d3a7e3bf8dc8e3e072a580439d021a77f88ce224ed44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mk-configure \
mk-configure-rpm-macros \
rpm_macro(mkcmake)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/awk \
bmake \
bmkdep"

inherit rpm

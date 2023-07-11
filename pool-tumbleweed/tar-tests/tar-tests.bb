SUMMARY = "Tests for the package"
DESCRIPTION = "Upstream testsuite for the package"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-tests-1.34-10.4.aarch64.rpm"
RPM_HASH = "9c7da8e0f45def8e48394a38b520426cb7c43dc34667c3790d98cb060678c24e14105f546be46fcb4fbc67ad9af366b9d9582919a21225c798e0b0dfcb639f9c"

RPROVIDES:${PN} += "tar-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
tar"

inherit rpm

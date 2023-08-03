SUMMARY = "Tests for the package"
DESCRIPTION = "Upstream testsuite for the package"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-tests-1.34-11.1.aarch64.rpm"
RPM_HASH = "d949ccd5d63aba45e414702745b820f5ea38d812c94a4dbe531b9eba68263931eaff5fd8e656bf856c9755bc3fc645c791f86603fad7940fc92d8b115f97fb41"

RPROVIDES:${PN} += "tar-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
tar"

inherit rpm

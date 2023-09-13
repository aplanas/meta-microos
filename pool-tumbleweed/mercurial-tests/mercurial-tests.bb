SUMMARY = "Mercurial tests"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects. \
 \
This package contains its tests."
LICENSE = "GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "mercurial-tests-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1d90a07815f12d78897bad0d9f8c9b19253fb7e2322c9cd77ce6c6db71a4e4c26300ef31271cbf524825c4335aa037af85deb30be931366085ae04b71961410f"

RPROVIDES:${PN} += "mercurial-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
mercurial"

inherit rpm

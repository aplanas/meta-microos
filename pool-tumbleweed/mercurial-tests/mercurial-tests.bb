SUMMARY = "Mercurial tests"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects. \
 \
This package contains its tests."
LICENSE = "GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "mercurial-tests-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "246e3b5387a024bf2a96691dd6a288be1ae36b24e0c145c4f8a202879b09c03bfda33c4408cb4faca9306477e670b96a1538158a5e29803e2f0e05a8ec467bdd"

RPROVIDES:${PN} += "mercurial-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
mercurial"

inherit rpm

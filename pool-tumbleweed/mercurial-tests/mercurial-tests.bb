SUMMARY = "Mercurial tests"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects. \
 \
This package contains its tests."
LICENSE = "GPL-2.0-or-later"

PV = "6.5"

RPM_NAME = "mercurial-tests-6.5-1.1.aarch64.rpm"
RPM_HASH = "a30fb3f1d57ac77f7763fc75e0efde36ce236ec43001f3cd1871d300161452a7bfadde0f84d3d6082fe830a762ec5e264abbe3b9b5f0c32bf4a23382c4301462"

RPROVIDES:${PN} += "mercurial-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
mercurial"

inherit rpm

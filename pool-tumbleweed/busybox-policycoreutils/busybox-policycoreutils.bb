SUMMARY = "Busybox applets replacing policycoreutils"
DESCRIPTION = "This package contains the symlinks to provide policycoreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-policycoreutils-1.36.1-30.1.noarch.rpm"
RPM_HASH = "0020d3233000da4af6a6194f085f7c41746cc278820f64a0b0a2fa7a40806cc9cbfd04cf0ff575822306b9bc8cf7cb1261996a23cacecfdc5ca42871735cf83e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-policycoreutils"

RDEPENDS:${PN} += "busybox"

inherit rpm

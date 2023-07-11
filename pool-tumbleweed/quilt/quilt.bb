SUMMARY = "A Tool for Working with Many Patches"
DESCRIPTION = "Quilt allows you to easily manage large numbers of patches by keeping \
track of the changes each patch makes. Patches can be applied, \
un-applied, refreshed, and more."
LICENSE = "GPL-2.0-or-later"

PV = "0.67"

RPM_NAME = "quilt-0.67-3.3.noarch.rpm"
RPM_HASH = "b144317f32ed1fd3c5d9db78ba0fd907495acc91c68a3a10babb87cd7e8c362f42ceeec441799c4376a1f02ff2bf8d58ea64fcc3e9b8c7c813dde669ed70dbbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-quilt \
quilt"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
coreutils \
diffstat \
diffutils \
file \
findutils \
gzip \
less \
mktemp \
patch \
perl"

inherit rpm

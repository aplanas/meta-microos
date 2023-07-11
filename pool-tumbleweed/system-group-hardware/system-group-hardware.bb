SUMMARY = "Hardware related system groups"
DESCRIPTION = "This package provides some hardware related system groups \
required by udev."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-hardware-20170617-24.16.noarch.rpm"
RPM_HASH = "40e615ebbd9172f64acd293921db21ba2171c7c3ca7ec7e2d750228f560edb4435ef4141472a4f352979ba5c221715716be465e05593eaf796e12417de444059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-audio \
group-cdrom \
group-dialout \
group-disk \
group-input \
group-kmem \
group-lock \
group-lp \
group-render \
group-sgx \
group-tape \
group-tty \
group-utmp \
group-video \
system-group-hardware"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

SUMMARY = "System user and group 'man'"
DESCRIPTION = "This package provides the system account and group 'man' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-man-20170617-24.14.noarch.rpm"
RPM_HASH = "4ad6b7057e268fb2fcb23deefb56722a110b5a3409c866627a3421ca77fe0661872c1d0c70c96dc254e2518a2f17916ce0f0be2066e424def11a8aafda6f3f2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(man) \
system-user-man \
user(man)"
RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm

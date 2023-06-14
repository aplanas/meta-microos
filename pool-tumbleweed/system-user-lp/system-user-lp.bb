SUMMARY = "System user lp"
DESCRIPTION = "This package provides the system account and group 'lp'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-lp-20170617-24.14.noarch.rpm"
RPM_HASH = "b70de04474150a7c77fc79a84a65de3228fbe348154cd3e5362c6bb2bc54f4c9d0a9cee6a2c84f94a5f7a501835a335dad7ab84a3e0531dee33d04542521df80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-lp \
system-user-lp \
user-lp"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm

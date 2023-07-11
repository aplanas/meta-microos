SUMMARY = "System user and group nobody"
DESCRIPTION = "This package provides the system account and group 'nobody'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-nobody-20170617-24.16.noarch.rpm"
RPM_HASH = "ecaa727d97add69b25bc3c9987012ce95b88dec19a66a61f7c6cf8fc1b8fa09d248a55fe0543f5c32f92c095f002518fde718e5a3347967800a97314f202d953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-nobody \
group-nogroup \
system-user-nobody \
user-nobody"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

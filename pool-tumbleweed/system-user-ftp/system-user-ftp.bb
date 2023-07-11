SUMMARY = "System user and group ftp"
DESCRIPTION = "This package provides the system account and group 'ftp'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-ftp-20170617-24.16.noarch.rpm"
RPM_HASH = "1bf1f24f64321fbf156a584a86f81c8fdf5be57d593b88c1ff945870faa650985f60b916df5e5350dd097f9d817ab1ffa7ad7f1ac4ca384a4ac20595427c7658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-ftp \
system-user-ftp \
user-ftp"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

SUMMARY = "System user ntp and group"
DESCRIPTION = "This package provides the system user and group 'ntp'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-ntp-20170617-24.16.noarch.rpm"
RPM_HASH = "0b2c0429cb107613df02eee6e98331aa2642603bde388a70eec1968760308644e6a8ebae1422f74262b4ad6ee34303defe1a0fe788f1f6983389c7d071bbb382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-ntp \
system-user-ntp \
user-ntp"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

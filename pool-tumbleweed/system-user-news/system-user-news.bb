SUMMARY = "System user and group 'news'"
DESCRIPTION = "This package provides the system account and group 'news' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-news-20170617-24.16.noarch.rpm"
RPM_HASH = "bfa3bf5d18c33ad56cfa7b2d442dea672d0a81440fbf4fe1b040ec0297782d73beaec9f7009e8fb4fb362c7f3893292b94666d313843e5cb267c3924f9a5d84b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-news \
system-user-news \
user-news"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

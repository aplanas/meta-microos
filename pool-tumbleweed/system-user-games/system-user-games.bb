SUMMARY = "System user and group games"
DESCRIPTION = "This package provides the system account and group 'games'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-games-20170617-24.14.noarch.rpm"
RPM_HASH = "b0938a38b5874d2110cc2285b0f3a684d7f86d3fc824a7e594ed6f4ea58be0290f538f5cb95ada81c9f04b8cf7873818f66ebca3292044114af1620070d434d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-games \
system-user-games \
user-games"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm

SUMMARY = "System user and group uucp"
DESCRIPTION = "This package provides the system account and group 'uucp' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-uucp-20170617-24.16.noarch.rpm"
RPM_HASH = "01a3dc389a93f1e5380f3fcc61b55fb7fe3244b6e137e2c8cad8a933c607d5eef8308f7cb8181fb6f7719778f17a4b7cf40f84010d88e331d844c842beb703aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-uucp \
system-user-uucp \
user-uucp"

RDEPENDS:${PN} += "/usr/bin/sh \
group-lock \
sysuser-shadow"

inherit rpm

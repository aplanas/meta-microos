SUMMARY = "System users and groups for grommunio"
DESCRIPTION = "This package provides the system accounts for grommunio."
LICENSE = "MIT"

PV = "3"

RPM_NAME = "system-user-grommunio-3-1.2.noarch.rpm"
RPM_HASH = "6bffb09a327a5616832c4a3adc2e7f9302d48e877f626cc4fb8b5b0386a9ceaadc9edfbc6f2e6adbe1db0a4cb086dc8146f6187769170c0d7a1f888ebcc75388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-grommunio \
group-groweb \
system-user-grommunio \
system-user-groweb \
user-grommunio \
user-groweb"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

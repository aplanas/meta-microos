SUMMARY = "System user and group nobody"
DESCRIPTION = "This package provides the system account and group 'nobody'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-nobody-20170617-24.14.noarch.rpm"
RPM_HASH = "154fcd3c2e367f25187efbd4590244ccb0850c6c929efda06dc6010b89edcae14a372fcc9d8c5d632c064598eb5ad53933872293259cf6faf2aa39e2a88daa30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-nobody \
group-nogroup \
system-user-nobody \
user-nobody"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm

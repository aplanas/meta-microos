SUMMARY = "System user and group root"
DESCRIPTION = "This package provides the root account including the groups root, \
shadow and users."
LICENSE = "MIT"

PV = "20190513"

RPM_NAME = "system-user-root-20190513-2.12.noarch.rpm"
RPM_HASH = "cd7452bce9084d53eeccc3c1f7ad59110ab8f5cbe9e589fa2428c45ea016234c6325fbcc6f91e3442e5ebec10e4c609d76ec8dbe28e7587128c424c94406c610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-root \
group-shadow \
group-trusted \
group-users \
system-user-root \
user-root"

RDEPENDS:${PN} += ""

inherit rpm

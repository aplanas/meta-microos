SUMMARY = "System user and group root"
DESCRIPTION = "This package provides the root account including the groups root, \
shadow and users."
LICENSE = "MIT"

PV = "20190513"

RPM_NAME = "system-user-root-20190513-2.14.noarch.rpm"
RPM_HASH = "177b41e7217d0adda44e08cb0d9311ccb9f931e674cfcfdaa958ea5d7310a1e25f400baeb84718cb99fcccdbe4e5b6fc4d45afcd2cf2ae6ee49133513445eaa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-root \
group-shadow \
group-trusted \
group-users \
system-user-root \
user-root"

RDEPENDS:${PN} += ""

inherit rpm

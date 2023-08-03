SUMMARY = "Tool to execute sysusers.d with shadow utilities"
DESCRIPTION = "This package contians a tool, which expects as input a sysusers.d \
configuration file and uses the shadow suite to create the users \
and groups from it like systemd-sysusers would do."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "sysuser-shadow-3.2-1.1.noarch.rpm"
RPM_HASH = "6153665f085f02f09332d332073ef81b1aa27f04b150955998ee1e93b91081f821215b3e3748c503743061a4c1a1a9cb3d3d6fc2d7b0b3c88e5e16bb1c32d466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysuser-shadow"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

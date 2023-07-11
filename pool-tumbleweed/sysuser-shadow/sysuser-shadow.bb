SUMMARY = "Tool to execute sysusers.d with shadow utilities"
DESCRIPTION = "This package contians a tool, which expects as input a sysusers.d \
configuration file and uses the shadow suite to create the users \
and groups from it like systemd-sysusers would do."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "sysuser-shadow-3.1-5.5.noarch.rpm"
RPM_HASH = "bef3e5ad4e24a97075601e1fec40e006976fd7a8aff246343a1d8db2bb6d400a4b56b04eb6b2736f0af094a0e7f72303181a6e865187747265659573ba10d70e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysuser-shadow"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

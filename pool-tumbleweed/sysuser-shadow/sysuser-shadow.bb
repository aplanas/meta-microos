SUMMARY = "Tool to execute sysusers.d with shadow utilities"
DESCRIPTION = "This package contians a tool, which expects as input a sysusers.d \
configuration file and uses the shadow suite to create the users \
and groups from it like systemd-sysusers would do."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "sysuser-shadow-3.1-5.3.noarch.rpm"
RPM_HASH = "b21a9d7f5fec5ac2d3b8ff492515b3377ccc92e721c17093b496569624ee0298c468a5e19fe46abe830146d84dd00289fb27a1b6e087c73cc3d62bccbfa8d4ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysuser-shadow"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm

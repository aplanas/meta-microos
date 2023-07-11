SUMMARY = "Zypper subcommand for lifecycle information"
DESCRIPTION = "Zypper subcommand for products and packages lifecycle information."
LICENSE = "GPL-2.0"

PV = "0.6.1601367426.843fe7a"

RPM_NAME = "zypper-lifecycle-plugin-0.6.1601367426.843fe7a-3.5.noarch.rpm"
RPM_HASH = "543f642f243a76d551b73f8b1cf949bf4662cb15bac5fbd568aa9e724205285dfd00ce0e1b2165655bd3540975ae77fc00c24049728b6af6682c503222376667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-lifecycle-plugin"

RDEPENDS:${PN} += "/usr/bin/ruby \
/usr/bin/sh \
systemd \
zypper"

inherit rpm

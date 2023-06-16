SUMMARY = "Zypper subcommand for lifecycle information"
DESCRIPTION = "Zypper subcommand for products and packages lifecycle information."
LICENSE = "GPL-2.0"

PV = "0.6.1601367426.843fe7a"

RPM_NAME = "zypper-lifecycle-plugin-0.6.1601367426.843fe7a-3.4.noarch.rpm"
RPM_HASH = "b6a9e22a64a80a7231bcae0b7e95cf9bc3d2f6f0a83fda2a72bab3aa8d67a16724b6327f1f7f7def6b8edf5aaf3816f18efca8f31a006dc220e2ac506e13a938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-lifecycle-plugin"

RDEPENDS:${PN} += "/usr/bin/ruby \
/usr/bin/sh \
systemd \
zypper"

inherit rpm

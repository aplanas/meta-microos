SUMMARY = "Support Troubleshooting Tools"
DESCRIPTION = "A package containing troubleshooting tools. This package contains \
the following: supportconfig, chkbin, getappcore, analyzevmcore"
LICENSE = "GPL-2.0-only"

PV = "3.1.25"

RPM_NAME = "supportutils-3.1.25-1.1.noarch.rpm"
RPM_HASH = "2d4c8919a43bc95fa06319696860decb8f9b500a9493fb46625e7b2d75bbab3a41404ccce2a8e2fc60bcdab9d7229457d7a669b3b20e25a88af3f72fd14f7ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "supportconfig-plugin-icommand \
supportconfig-plugin-resource \
supportconfig-plugin-tag \
supportutils"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/awk \
/usr/bin/sed \
/usr/bin/which \
iproute2 \
kmod-compat \
ncurses-utils \
tar \
util-linux-systemd"

inherit rpm

SUMMARY = "Support Troubleshooting Tools"
DESCRIPTION = "A package containing troubleshooting tools. This package contains \
the following: supportconfig, chkbin, getappcore, analyzevmcore"
LICENSE = "GPL-2.0-only"

PV = "3.1.26"

RPM_NAME = "supportutils-3.1.26-1.1.noarch.rpm"
RPM_HASH = "8ea6d5dc01f5c8a1428ab7402bb003a942fff1ec24f7cfd534c2310e48dc459b60354ceccdffb3fcf5d62bd74e53ad48b2a83a0b4ecaf5f9bccf36c37a30ad96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "supportconfig-plugin-icommand \
supportconfig-plugin-resource \
supportconfig-plugin-tag \
supportutils"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/sed \
/usr/bin/which \
iproute2 \
kmod-compat \
ncurses-utils \
tar \
util-linux-systemd"

inherit rpm

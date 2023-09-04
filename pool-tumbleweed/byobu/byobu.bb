SUMMARY = "Enhanced profile and configuration utilities for GNU Screen and tmux"
DESCRIPTION = "Byobu includes an enhanced profiles, convenient keybindings, \
configuration utilities, and toggle-able system status \
notifications for both the GNU Screen window manager and tmux \
terminal multiplexer."
LICENSE = "GPL-3.0-only"

PV = "5.133"

RPM_NAME = "byobu-5.133-2.14.noarch.rpm"
RPM_HASH = "28a764cafff41ac1e4b40da0765ab973bc64a91ed94a9d38e8dee4e356093bff1a5aff8a070b301bc9a45c68314a1c208a4b1c5ea9855046e7af460da3b2ae34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byobu \
config-byobu"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
coreutils \
gawk \
gettext-runtime \
net-tools \
perl--MODULE-COMPAT-5.38.0 \
python3-newt \
snack"

inherit rpm

SUMMARY = "Enhanced profile and configuration utilities for GNU Screen and tmux"
DESCRIPTION = "Byobu includes an enhanced profiles, convenient keybindings, \
configuration utilities, and toggle-able system status \
notifications for both the GNU Screen window manager and tmux \
terminal multiplexer."
LICENSE = "GPL-3.0-only"

PV = "5.133"

RPM_NAME = "byobu-5.133-2.12.noarch.rpm"
RPM_HASH = "ee6bbc9f246aed3c317fa1797f7d7c61027ac8dd749447cb2cac60afbda01bfdaea4d146bb60a643bdf8ae5f46e8b6ff6634155f220d8c04d2b3a79aa4ebf887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byobu \
config-byobu"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
coreutils \
gawk \
gettext-runtime \
net-tools \
perl--MODULE-COMPAT-5.36.0 \
python3-newt \
snack"

inherit rpm

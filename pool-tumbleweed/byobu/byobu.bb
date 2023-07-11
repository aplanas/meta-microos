SUMMARY = "Enhanced profile and configuration utilities for GNU Screen and tmux"
DESCRIPTION = "Byobu includes an enhanced profiles, convenient keybindings, \
configuration utilities, and toggle-able system status \
notifications for both the GNU Screen window manager and tmux \
terminal multiplexer."
LICENSE = "GPL-3.0-only"

PV = "5.133"

RPM_NAME = "byobu-5.133-2.13.noarch.rpm"
RPM_HASH = "74b42446d71133f18a47ad818e22a2c03470eae72068350dbacadf67e5ca012c95cdc9d3a7acca0f751d6cb3b4cc9f74e724fa2a6f9ca5c56620fa448caf21f1"
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
perl--MODULE-COMPAT-5.36.1 \
python3-newt \
snack"

inherit rpm

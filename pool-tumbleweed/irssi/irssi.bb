SUMMARY = "Modular IRC Client"
DESCRIPTION = "Irssi is a modular IRC client that currently only has a text mode \
user interface. However, 80–90% of the code is not text mode \
specific, so other UIs could be created. Irssi is not IRC specific; \
there are SILC and ICB modules available. \
 \
Irssi is not using the ircII code."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "irssi-1.4.4-2.1.aarch64.rpm"
RPM_HASH = "efc29d5bfe23e406ce73f7671d1c862c080dde932374f38cc9326a81617a217fda4bd2a9abb3195ba86b539acde35b43700addc9d6bac2433476c8ba1bc998a0"

RPROVIDES:${PN} += "irssi \
libfe-perl.so \
libirc-proxy.so \
libotr-core.so \
libperl-core.so \
perl-Irssi \
perl-Irssi--Irc \
perl-Irssi--TextUI \
perl-Irssi--UI"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libotr.so.5 \
libperl.so \
libssl.so.3 \
libtinfo.so.6 \
libutf8proc.so.2 \
perl \
perl--MODULE-COMPAT-5.36.0"

inherit rpm

SUMMARY = "Modular IRC Client"
DESCRIPTION = "Irssi is a modular IRC client that currently only has a text mode \
user interface. However, 80–90% of the code is not text mode \
specific, so other UIs could be created. Irssi is not IRC specific; \
there are SILC and ICB modules available. \
 \
Irssi is not using the ircII code."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "irssi-1.4.4-2.3.aarch64.rpm"
RPM_HASH = "2000fecfbdd3c783c05c269dac279b935bc19efa44b08e9b23c4fc0c288aa2ed587b8ecc85af27d3d19f87f40a7bb51c86bd7b7d35b91cfa90187f3dc9afebd5"

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
perl--MODULE-COMPAT-5.36.1"

inherit rpm

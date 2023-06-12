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

RPROVIDES:${PN} += "application() \
application(irssi.desktop) \
irssi \
irssi(aarch-64) \
libfe_perl.so()(64bit) \
libirc_proxy.so()(64bit) \
libotr_core.so()(64bit) \
libperl_core.so()(64bit) \
perl(Irssi) \
perl(Irssi::Irc) \
perl(Irssi::TextUI) \
perl(Irssi::UI)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libotr.so.5()(64bit) \
libperl.so()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libutf8proc.so.2()(64bit) \
perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

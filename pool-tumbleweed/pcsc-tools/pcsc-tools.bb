SUMMARY = "Smart card tools"
DESCRIPTION = "These tools are used to test a PC/SC driver, card or reader \
or send commands in a friendly environment \
(text or graphical user interface)."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.2"

RPM_NAME = "pcsc-tools-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "0180a8bab6c73ed62cce527f9a51e4595055585c6d0ddb0a8545e905de4d68538a2132bd265d7b35afffdbf0c64e4a1fe7a13025164bdce08f51f051b71e820f"

RPROVIDES:${PN} += "pcsc-tools \
pcsc-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcsclite.so.1()(64bit) \
perl(Glib) \
perl(Gtk3) \
perl-pcsc"

inherit rpm

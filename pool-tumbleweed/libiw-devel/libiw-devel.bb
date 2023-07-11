SUMMARY = "Tools for a wireless LAN"
DESCRIPTION = "This package contains the wireless tools, used to manipulate the \
wireless extensions. The wireless extension is an interface that allows \
you to set wireless LAN specific parameters and get specific stats."
LICENSE = "GPL-2.0-only"

PV = "30.pre9"

RPM_NAME = "libiw-devel-30.pre9-40.8.aarch64.rpm"
RPM_HASH = "c628559ed7650eef3103c47fa9ed9ee90839668ae4345fe5bdf1d30faa67bbea7761c8e5dbcb9a33e6388b2e8d8241c6305877b41e0c04f4b5bab7d760f93ef6"

RPROVIDES:${PN} += "libiw-devel"

RDEPENDS:${PN} += "glibc-devel \
libiw30"

inherit rpm

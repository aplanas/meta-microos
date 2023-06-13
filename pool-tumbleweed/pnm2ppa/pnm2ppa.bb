SUMMARY = "HP PPA GhostScript filter"
DESCRIPTION = "pnm2ppa is a Ghostscript print filter which allows owners of HP DeskJet \
710C, 712C, 720C, 722C, 820Cse, 820Cxi, 1000Cse, or 1000Cxi printers to \
print PostScript Level 2."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "pnm2ppa-1.13-2.12.aarch64.rpm"
RPM_HASH = "19e42ef9192d68a27de37a194fd54691bbebd5039b449551d8d27cdfc5a4e4b27cfe4e0872c9137d0b9bff29b7761473a45321d26671aadf86c0b07410335151"

RPROVIDES:${PN} += "config(pnm2ppa) \
pnm2ppa \
pnm2ppa(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

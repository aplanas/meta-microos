SUMMARY = "HP PPA GhostScript filter"
DESCRIPTION = "pnm2ppa is a Ghostscript print filter which allows owners of HP DeskJet \
710C, 712C, 720C, 722C, 820Cse, 820Cxi, 1000Cse, or 1000Cxi printers to \
print PostScript Level 2."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "pnm2ppa-1.13-2.13.aarch64.rpm"
RPM_HASH = "d706bc230c6044030cf41f1de0dd5a128acd921308aeae2b47907c5e3abc3c156df825384c9395f60a8c41ea3957c96489d4d2b78ad01a45bd4b205c0592d22b"

RPROVIDES:${PN} += "config-pnm2ppa \
pnm2ppa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

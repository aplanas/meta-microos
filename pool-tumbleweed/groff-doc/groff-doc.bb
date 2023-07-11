SUMMARY = "HTML documentation and examples for groff"
DESCRIPTION = "The groff package provides compatible versions of troff, nroff, eqn, \
tbl, and other Unix text formatting utilities. \
 \
Groff is used to 'compile' man pages stored in groff or nroff format \
for different output devices, for example, displaying to a screen or in \
PostScript format for printing on a PostScript printer."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.4"

RPM_NAME = "groff-doc-1.22.4-10.5.noarch.rpm"
RPM_HASH = "b46556affd4608f68732b8a64b1ca5b28ae934c3c270f9225a68db3818d80cb191605d9b23afbcf489d91f60acd837d61095de2359dac0d82f7be0bd317e291a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "groff-doc"

RDEPENDS:${PN} += ""

inherit rpm

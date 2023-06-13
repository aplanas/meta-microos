SUMMARY = "HTML documentation and examples for groff"
DESCRIPTION = "The groff package provides compatible versions of troff, nroff, eqn, \
tbl, and other Unix text formatting utilities. \
 \
Groff is used to 'compile' man pages stored in groff or nroff format \
for different output devices, for example, displaying to a screen or in \
PostScript format for printing on a PostScript printer."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.4"

RPM_NAME = "groff-doc-1.22.4-10.3.noarch.rpm"
RPM_HASH = "e82a83810f54cf8489e3d6bc9e20d6bf1963a3dcc29185b88d627a1f783c61e0c70ec14a2eb281702a141d7b20694884b9264e54de7743f65c93e572654e9d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "groff-doc"

RDEPENDS:${PN} += ""

inherit rpm

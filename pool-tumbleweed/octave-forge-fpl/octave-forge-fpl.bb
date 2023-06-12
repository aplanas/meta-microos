SUMMARY = "Fem PLotting for Octave"
DESCRIPTION = "Collection of routines to export data produced by Finite Elements or Finite \
Volume Simulations in formats used by some visualization programs. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.3.5"

RPM_NAME = "octave-forge-fpl-1.3.5-1.22.noarch.rpm"
RPM_HASH = "ca989584d2b9f75a1446dbc38dd96d31f16a91a21130d7e42adf550f6917b83e44227a2ad551966b622354cd118b60c583249911bb1dd30b2e109908a94d598b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-fpl"
RDEPENDS:${PN} += "/bin/sh \
octave-cli"

inherit rpm

SUMMARY = "Financial instruments for Octave"
DESCRIPTION = "Financial manipulation, plotting functions and additional date manipulation tools. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "octave-forge-financial-0.5.3-1.16.noarch.rpm"
RPM_HASH = "4a8b69b8d548460ff43a32ad1622a13efcdd70e3cb5d573ba60990520d88ae6a7d20d769c71f9672eeddffd687f06f5fc267f3d98fa7bce9b47d6eb1f2fae6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-financial"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-io"

inherit rpm

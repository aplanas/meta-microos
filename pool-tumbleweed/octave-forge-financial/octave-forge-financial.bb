SUMMARY = "Financial instruments for Octave"
DESCRIPTION = "Financial manipulation, plotting functions and additional date manipulation tools. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "octave-forge-financial-0.5.3-1.15.noarch.rpm"
RPM_HASH = "39263dffa336b4e86d060a3dc72acc8e74a76542faac0104b67d5897a976b17133c314535f2648134f8255883d11ab8b534e36ccf8cf2c6d607a3bbd099b0659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-financial"

RDEPENDS:${PN} += "/bin/sh \
octave-cli \
octave-forge-io"

inherit rpm

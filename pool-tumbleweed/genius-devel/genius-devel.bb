SUMMARY = "Development files for Genius, a general purpose calculator"
DESCRIPTION = "Genius is a general purpose calculator program similar in some aspects \
to BC, Matlab, Maple or Mathematica. It is useful both as a simple \
calculator and as a research or educational tool. The syntax \
mimics how mathematics is usually written."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.27"

RPM_NAME = "genius-devel-1.0.27-1.10.aarch64.rpm"
RPM_HASH = "deb2fd1f73295ada9ad2acb5c0fde13315744b71d5f46bcc8ff702d29f27793d09684059ef3d3c2d0c9159dfe436d88ed295090f7da25d31423d9fe1b282f02d"

RPROVIDES:${PN} += "genius-devel"

RDEPENDS:${PN} += "genius"

inherit rpm

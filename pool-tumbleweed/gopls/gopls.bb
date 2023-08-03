SUMMARY = "Go LSP protocol language server"
DESCRIPTION = "gopls (pronounced 'Go please') is the official Go language server developed \
by the Go team. It provides IDE features to any LSP-compatible editor."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "gopls-0.13.0-1.1.aarch64.rpm"
RPM_HASH = "3d44cf8df575a104fcd660f8e86bacf9c31eb67dc0066ef1d33c5b263113bbad278fa20618bbd99b49fc716ee0192b9bc151653572f6a2f1874660838c663ab8"

RPROVIDES:${PN} += "gopls"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

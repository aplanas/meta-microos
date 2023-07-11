SUMMARY = "Go LSP protocol language server"
DESCRIPTION = "gopls (pronounced 'Go please') is the official Go language server developed \
by the Go team. It provides IDE features to any LSP-compatible editor."
LICENSE = "BSD-3-Clause"

PV = "0.12.4"

RPM_NAME = "gopls-0.12.4-1.1.aarch64.rpm"
RPM_HASH = "b65e791800110ed48f13cde9ab078827e0fce968c2b95532066633c94ee67282b89cfbec62d20a570cec1075eb9a8539e14428a42859e2ee29afdb2d585fa949"

RPROVIDES:${PN} += "gopls"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

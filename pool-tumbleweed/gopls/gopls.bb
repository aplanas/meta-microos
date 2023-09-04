SUMMARY = "Go LSP protocol language server"
DESCRIPTION = "gopls (pronounced 'Go please') is the official Go language server developed \
by the Go team. It provides IDE features to any LSP-compatible editor."
LICENSE = "BSD-3-Clause"

PV = "0.13.2"

RPM_NAME = "gopls-0.13.2-1.1.aarch64.rpm"
RPM_HASH = "3d61890caae784f3bdc24fe9de469765978b838d5b8480acffc337f600643ccd3fb4d156f16af0771eb1885284b5c343e103e82e7fe44658a43eab72ee9a56ee"

RPROVIDES:${PN} += "gopls"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

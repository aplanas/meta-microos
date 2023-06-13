SUMMARY = "Fish completion for wl-clipboard"
DESCRIPTION = "Fish command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "wl-clipboard-fish-completion-2.1.0-1.6.noarch.rpm"
RPM_HASH = "563c2c20df3c16aa37ddf7bd37b9eb357621c02e7e56ae99eaa5c25eac5d898b7064f00ffa4c04ef14103df037f7d2a57dc55b2efc5e32381973a3012e2e8a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-fish-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm

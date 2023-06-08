SUMMARY = "Fish completion for flameshot"
DESCRIPTION = "Fish command line completion support for flameshot."
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-fish-completion-12.1.0-1.4.noarch.rpm"
RPM_HASH = "65aad12b12ea64453b08cd087d47f18c99e4a004c9a3635f6447bf0240cb869aadae8762dce4bd119b162ac1b0af642f9eba2bda9f221427c244b251b8e27944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-fish-completion"
RDEPENDS:${PN} += "flameshot"

inherit rpm

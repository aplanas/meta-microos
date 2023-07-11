SUMMARY = "Fish completion for fwupd"
DESCRIPTION = "This package contain the fish completion command for the device firmware updater daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.16"

RPM_NAME = "fwupd-fish-completion-1.8.16-2.1.noarch.rpm"
RPM_HASH = "e95a7a96e690e9d3d18f6fa45a5cd94fb953f55731ff231466f5aea4c742711b4e9c70582d4c256d824d0d4c2317c837f4a7882e4edf0781634589de0b98cf54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-fish-completion"

RDEPENDS:${PN} += "fish \
fwupd"

inherit rpm

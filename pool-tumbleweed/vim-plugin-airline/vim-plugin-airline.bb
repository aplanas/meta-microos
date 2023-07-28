SUMMARY = "Lean & mean status/tabline for vim that's light as air."
DESCRIPTION = "When the plugin is correctly loaded, there will be a nice \
statusline at the bottom of each vim window."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "vim-plugin-airline-0.11-56.1.noarch.rpm"
RPM_HASH = "68789295399a08db446b3591584841db71e6111bfa6f4508eb700f6a49ad4a4e98e1a7ee7972b38df3eab0bae2cd5ee5a490d5637fec14bacec9600783d626e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-airline"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

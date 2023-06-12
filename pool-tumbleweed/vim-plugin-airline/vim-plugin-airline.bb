SUMMARY = "Lean & mean status/tabline for vim that's light as air."
DESCRIPTION = "When the plugin is correctly loaded, there will be a nice \
statusline at the bottom of each vim window."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "vim-plugin-airline-0.11-55.1.noarch.rpm"
RPM_HASH = "6d94bf92ef9bbf1792297c94618d888f35dce3e46641e360c1d09bd5a6680fc4ddc019e142ec20d95fd6a0574b88a37391c3ce5f3fba9f9c43cdaa4ab30a21c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-airline"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm

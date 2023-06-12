SUMMARY = "Run the ack search tool from Vim"
DESCRIPTION = "Run the ack search tool from Vim, with enhanced results listing."
LICENSE = "Vim"

PV = "1.0.9"

RPM_NAME = "vim-plugin-ack-1.0.9-55.1.noarch.rpm"
RPM_HASH = "5cc9c8cbac05acf800550b02c409d2e0a84fbecad9749f42c58c4c994294b297ff9142e54085d604689edcca3a5554fbe408e7975836821a7bb5a67a5ef76c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-ack \
vim-plugin-ag"
RDEPENDS:${PN} += "/bin/sh \
ack"

inherit rpm

SUMMARY = "Salt plugin for Vim"
DESCRIPTION = "This Vim plugin provides support for editing Saltstack .sls files."
LICENSE = "Apache-2.0"

PV = "20170630"

RPM_NAME = "vim-plugin-salt-20170630-55.1.noarch.rpm"
RPM_HASH = "1ea1071daf1ef55e3b0319f71751115b372a1f335ccd3d6d2f485e72472a7a77a271b12677fa167693c77d7d2ce8002a3e7f3e40ba7ea7fd6988790ec3dacde4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-salt"

RDEPENDS:${PN} += ""

inherit rpm

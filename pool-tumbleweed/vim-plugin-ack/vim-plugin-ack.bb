SUMMARY = "Run the ack search tool from Vim"
DESCRIPTION = "Run the ack search tool from Vim, with enhanced results listing."
LICENSE = "Vim"

PV = "1.0.9"

RPM_NAME = "vim-plugin-ack-1.0.9-56.1.noarch.rpm"
RPM_HASH = "f29d2844ef880e390d5595deff66bef8fa47b4bd002c88a84a79a7d3d92f7f985a9587469262ec36c8a34f9cd12a381ca20cc5c021b701fd1ff562bc41170bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-ack \
vim-plugin-ag"

RDEPENDS:${PN} += "/usr/bin/sh \
ack"

inherit rpm

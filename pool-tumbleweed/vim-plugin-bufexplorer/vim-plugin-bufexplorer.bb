SUMMARY = "Buffer Explorer / Browser"
DESCRIPTION = "With bufexplorer, you can quickly and easily switch between buffers by using \
the one of the default public interfaces: \
\\<Leader\\>be normal open \
\\<Leader\\>bt toggle open / close \
\\<Leader\\>bs force horizontal split open \
\\<Leader\\>bv force vertical split open \
 \
Once the bufexplorer window is open you can use the normal movement keys (hjkl) \
to move around and then use or to select the buffer you would like to open. If \
you would like to have the selected buffer opened in a new tab, simply press \
either or 't'. Please note that when opening a buffer in a tab, that if the \
buffer is already in another tab, bufexplorer can switch to that tab \
automatically for you if you would like."
LICENSE = "BSD-3-Clause"

PV = "7.4.26"

RPM_NAME = "vim-plugin-bufexplorer-7.4.26-56.1.noarch.rpm"
RPM_HASH = "f07e631e963cdd4316088cc1a8b82a93601f2b2a03da383a5f4e41a53df0d5a4195f0d8cece05ae93845e8b45a3efc1240dfb9af7ff0b832114959838ae35610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-bufexplorer"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

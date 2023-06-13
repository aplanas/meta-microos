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

PV = "7.4.25"

RPM_NAME = "vim-plugin-bufexplorer-7.4.25-55.1.noarch.rpm"
RPM_HASH = "35e905a7326af86ae5d4fd1f697c817c5c40bdce98961090e0ef81d36bd3027ef6a7906b9506a5519524adaf0964dc7396c7d4c9a016b6cd443df436440110fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-bufexplorer"

RDEPENDS:${PN} += "/bin/sh \
vim"

inherit rpm

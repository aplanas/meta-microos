SUMMARY = "Display multiple searches at the same time"
DESCRIPTION = "MultipleSearch allows you to have the results of multiple searches displayed \
on the screen at the same time.  Each search highlights its results in a \
different color, and all searches are displayed at once.  After the maximum \
number of colors is used, the script starts over with the first color."
LICENSE = "Vim"

PV = "1.3"

RPM_NAME = "vim-plugin-multiplesearch-1.3-56.1.noarch.rpm"
RPM_HASH = "477c821865cc1258776df5cd5c18c8990e43fc09433f06b65074edc15a66c7871289832de3671d705f9666d6a234fddf56853954470bc07c30305bcc78c7d959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-multiplesearch"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

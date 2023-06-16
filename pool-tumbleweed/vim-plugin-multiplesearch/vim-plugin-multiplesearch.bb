SUMMARY = "Display multiple searches at the same time"
DESCRIPTION = "MultipleSearch allows you to have the results of multiple searches displayed \
on the screen at the same time.  Each search highlights its results in a \
different color, and all searches are displayed at once.  After the maximum \
number of colors is used, the script starts over with the first color."
LICENSE = "Vim"

PV = "1.3"

RPM_NAME = "vim-plugin-multiplesearch-1.3-55.1.noarch.rpm"
RPM_HASH = "2ca459ec2c79109afd3680deaeb05e1364d2c4a5d5d11c6f0f0c5bb4f08a8e07b3f1762c464cafb63428989fdafe698c69ebb687949632237d287ed52b4f6512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-multiplesearch"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

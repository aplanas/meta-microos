SUMMARY = "Personal wiki for vim"
DESCRIPTION = "Vimwiki is a personal wiki for Vim. Using it you can organize text files with \
hyperlinks. To do a quick start press <Leader>ww (this is usually \\ww) to go \
to your index wiki file. By default it is located in ~/vimwiki/index.wiki. \
You do not have to create it manually - vimwiki can make it for you."
LICENSE = "GPL-2.0-only"

PV = "2.1"

RPM_NAME = "vim-plugin-vimwiki-2.1-55.1.noarch.rpm"
RPM_HASH = "c3a2e479965be3c83226472b4673f7c1afc6467489a2597a358cab644078974f839e4d454a24ba648d34a10eb789ae6c365e70971884ed827e853c32870e19c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-vimwiki"

RDEPENDS:${PN} += "/bin/sh \
vim"

inherit rpm

SUMMARY = "Personal wiki for vim"
DESCRIPTION = "Vimwiki is a personal wiki for Vim. Using it you can organize text files with \
hyperlinks. To do a quick start press <Leader>ww (this is usually \\ww) to go \
to your index wiki file. By default it is located in ~/vimwiki/index.wiki. \
You do not have to create it manually - vimwiki can make it for you."
LICENSE = "GPL-2.0-only"

PV = "2.1"

RPM_NAME = "vim-plugin-vimwiki-2.1-56.1.noarch.rpm"
RPM_HASH = "72a4fdc884d8afaade9fb511ff7c29451436534fe5538fe76ab1880b6025b247458913b259adbb689cc890d0d80b7be3330e0cb716e7105351343b37bb7148d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-vimwiki"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

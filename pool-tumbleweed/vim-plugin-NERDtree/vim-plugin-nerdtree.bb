SUMMARY = "A tree explorer plugin for navigating the filesystem"
DESCRIPTION = "The NERD tree allows you to explore your filesystem and to open files and \
directories. It presents the filesystem to you in the form of a tree which you \
manipulate with the keyboard and/or mouse. It also allows you to perform simple \
filesystem operations."
LICENSE = "WTFPL"

PV = "6.10.16"

RPM_NAME = "vim-plugin-NERDtree-6.10.16-56.1.noarch.rpm"
RPM_HASH = "315b019ba479ffcdbdf0ec7bb1bbbf590839b319c749e667eaf764a5911bdfc9de91d3da384afc7f2dee58fa1466e27db4e657643973751250c4f7e32add97e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-NERDtree"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

SUMMARY = "Organize/Navigate projects of files"
DESCRIPTION = "You can use this plugin's basic functionality to set up a list of \
frequently-accessed files for easy navigation. The list of files will be \
displayed in a window on the left side of the vim window, and you can press \
<Return> or double-click on filenames in the list to open the files. This is \
similar to how some IDEs I've used work. I find this easier to use than having \
to navigate a directory hierarchy with the file-explorer.  It also obviates the \
need for a buffer explorer because you have your list of files on the left of \
the vim window."
LICENSE = "SUSE-Public-Domain"

PV = "1.4.1"

RPM_NAME = "vim-plugin-project-1.4.1-55.1.noarch.rpm"
RPM_HASH = "a317675e3b6299ac0c205668bc531d95a4a24cf6793545c466e354cfd0cb52993db8d0f1cbc276c4535731bde264a1c1f88060e8584029edb4ce77340cf94414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-project"

RDEPENDS:${PN} += "/bin/sh \
vim"

inherit rpm

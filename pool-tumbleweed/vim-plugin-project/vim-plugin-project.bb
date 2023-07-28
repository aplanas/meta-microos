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

RPM_NAME = "vim-plugin-project-1.4.1-56.1.noarch.rpm"
RPM_HASH = "bc903a9c829d0359019d2fbb99777b95d7287caf562ac77695ffa1970d05ec317fbefda3ba556aeff31555ca17c374027447b859439bb2a9defd278932e60529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-project"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

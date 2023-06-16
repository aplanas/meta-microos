SUMMARY = "A quick buffer selector/switcher"
DESCRIPTION = "This plugin provides a simple buffer selector. It doesn't have all the features \
other buffer selectors have but can be useful for quickly switching to a \
different buffer or for deleting buffers."
LICENSE = "GPL-1.0-or-later"

PV = "0.7"

RPM_NAME = "vim-plugin-tselectbuffer-0.7-55.1.noarch.rpm"
RPM_HASH = "f5f92f68b83c406a3f095fb42a9694e5f1c5eae80ad12dbac0ca5851e6e3f32a04eb2613b843ee7a39de4cf79f17cde1c684ddb0d8a2ec9328feab53288b92be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tselectbuffer"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

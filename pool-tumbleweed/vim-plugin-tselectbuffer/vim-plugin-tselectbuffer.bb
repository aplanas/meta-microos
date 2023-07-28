SUMMARY = "A quick buffer selector/switcher"
DESCRIPTION = "This plugin provides a simple buffer selector. It doesn't have all the features \
other buffer selectors have but can be useful for quickly switching to a \
different buffer or for deleting buffers."
LICENSE = "GPL-1.0-or-later"

PV = "0.7"

RPM_NAME = "vim-plugin-tselectbuffer-0.7-56.1.noarch.rpm"
RPM_HASH = "2f1374570c0c719b3d614b46710afe8cc1e91cf5030ca5000db802c041a68605d8909113e3ebb38627778bc72cd891f7dd90517cece33d8037583789e2671eec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tselectbuffer"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

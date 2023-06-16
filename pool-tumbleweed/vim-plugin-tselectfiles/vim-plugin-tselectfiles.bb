SUMMARY = "A quick file selector/browser/explorer"
DESCRIPTION = "This plugin provides a simple file browser. It is not a full blown explorer but \
can be nevertheless be useful for quickly selecting a few files or renaming \
them."
LICENSE = "GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "vim-plugin-tselectfiles-0.11-55.1.noarch.rpm"
RPM_HASH = "f71008b13d19a4573c1f1207e2860095f4dd5ccdace03f9de07327dd5e542748f0b41a40bacfba5e11fe338733eb2788aec4771e9f59390cd3eff68f8ff7e6a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tselectfiles"

RDEPENDS:${PN} += "/usr/bin/sh \
vim \
vim-plugin-tlib"

inherit rpm

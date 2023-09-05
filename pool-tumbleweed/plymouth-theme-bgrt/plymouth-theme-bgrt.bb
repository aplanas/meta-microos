SUMMARY = "Plymouth 'bgrt' theme"
DESCRIPTION = "This package contains the 'bgrt' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-bgrt-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "add6a8e5328e705838cb3f29116441f2531a94b8249df37121193fbd68ead88e094c50eb9e95e281883ae86eae23a0af600356193bbaf2dc945c0f2c2fd15737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-bgrt"

RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts \
plymouth-theme-spinner"

inherit rpm

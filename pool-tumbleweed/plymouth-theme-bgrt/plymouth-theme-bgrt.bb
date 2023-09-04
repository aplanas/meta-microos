SUMMARY = "Plymouth 'bgrt' theme"
DESCRIPTION = "This package contains the 'bgrt' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-bgrt-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "936669e0fd746e15ad658d848ab26c44fcb172eba1b0a6eaf4b8af1c7097d4ff06fd28f2bb9dbe16937fb0605cd510e3013169252810197cac342c095ca2e7ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-bgrt"

RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts \
plymouth-theme-spinner"

inherit rpm

SUMMARY = "Plymouth 'bgrt' theme"
DESCRIPTION = "This package contains the 'bgrt' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-bgrt-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "ea0dedd52092530c5d9d45e8dc4bed9932d8cdf673f488f5b861f3fc476e24a0034b023c73eea786e76b7d8c6ddcbe5435cbfd97af03e1806eecc8a023aac93d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-bgrt"

RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts \
plymouth-theme-spinner"

inherit rpm

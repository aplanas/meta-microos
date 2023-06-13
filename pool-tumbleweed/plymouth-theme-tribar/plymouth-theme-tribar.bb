SUMMARY = "Plymouth 'Tribar' theme"
DESCRIPTION = "This package contains the 'Tribar' boot splash theme for \
Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-tribar-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "da0791b914519056ec40e25bce82c1c798224d8a67c590706d3662cfcff70f60a40f1ab883c936997c8794943e974f89beea0bd7c87fd535cc33aaaed108adc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-tribar"

RDEPENDS:${PN} += "plymouth-plugin-tribar \
plymouth-scripts"

inherit rpm

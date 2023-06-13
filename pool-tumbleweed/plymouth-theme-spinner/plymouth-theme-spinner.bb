SUMMARY = "Plymouth 'Spinner' theme"
DESCRIPTION = "This package contains the 'spinner' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinner-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "46a18ee70aee325785c3e7e68da52ee22e3b4c2cad35aa436bd498c646ce418e701cf9d6363c485d5f134f0659e5ff5bb5effd18636393ceab10753f326b1132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinner"

RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts"

inherit rpm

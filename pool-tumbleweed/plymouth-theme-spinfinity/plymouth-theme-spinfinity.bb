SUMMARY = "Plymouth 'Spinfinity' theme"
DESCRIPTION = "This package contains the 'Spinfinity' boot splash theme for \
Plymouth. It features a centered logo and animated spinner that \
spins in the shape of an infinity sign."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinfinity-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "bba251a0dcc5aa0b57176a4804947106c1e6da54e2e8de40c35d924a217ae525bf722f454df8409204d8b6dcb2c1fd6cb540ca74084fd1a352f8bfa314b2ebcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinfinity"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth \
plymouth-scripts"

inherit rpm

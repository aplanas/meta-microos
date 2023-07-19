SUMMARY = "Plymouth 'Tribar' theme"
DESCRIPTION = "This package contains the 'Tribar' boot splash theme for \
Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-tribar-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "0841d78607195dea5806a024964daa6a1634e47d6206b573952df06d715a648ce245431e9cff523089d54bc85a1e0955c7729c2a29b7e8499c54e8e02b445693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-tribar"

RDEPENDS:${PN} += "plymouth-plugin-tribar \
plymouth-scripts"

inherit rpm

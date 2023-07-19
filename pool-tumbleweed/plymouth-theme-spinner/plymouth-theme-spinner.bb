SUMMARY = "Plymouth 'Spinner' theme"
DESCRIPTION = "This package contains the 'spinner' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinner-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "bcc4beb1515d40dc7e1e024b0cd6f1da9fcf70c2d7906ebcc306f4c9d169c0f0672c8d47e13a46d3171e51662164138954a0bd7434783940d8f58b54527c3a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinner"

RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts"

inherit rpm

SUMMARY = "Plymouth 'Tribar' theme"
DESCRIPTION = "This package contains the 'Tribar' boot splash theme for \
Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-tribar-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "6a2501fd8c1898bed45a755b9934958cdb3034c52c6b7d74ab0142879721e183383b7c87b6f38c5b0ffeabe3116c86358b23ed14d76747dcc1fdf8aa3ad7596b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-tribar"

RDEPENDS:${PN} += "plymouth-plugin-tribar \
plymouth-scripts"

inherit rpm

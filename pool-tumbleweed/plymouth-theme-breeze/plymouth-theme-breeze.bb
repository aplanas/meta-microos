SUMMARY = "Plymouth 'Breeze' theme"
DESCRIPTION = "This package contains the 'breeze' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0+"

PV = "5.27.5"

RPM_NAME = "plymouth-theme-breeze-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "896294ddbe7493ea9a30b9ddc4aaf2fea0caee872c7940e6e3578a001a216c7fe892504c29f83d09f447c5e655a08db8d7c00c7cd01b616e2ed28a04def0475f"

RPROVIDES:${PN} += "plymouth-theme-breeze"

RDEPENDS:${PN} += "plymouth-plugin-label-ft \
plymouth-scripts \
plymouth-theme-breeze-plugin-breeze"

inherit rpm

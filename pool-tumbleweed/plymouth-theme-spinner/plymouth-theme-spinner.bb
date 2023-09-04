SUMMARY = "Plymouth 'Spinner' theme"
DESCRIPTION = "This package contains the 'spinner' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinner-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "9424e6187946749ddba759611b42f881ff4cef0a38e13ba3e0c24388a81bb973dda699edcd3dee5b376800e694f505b21f3a11b1dbe3648440002e6388d0103b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinner"

RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts"

inherit rpm

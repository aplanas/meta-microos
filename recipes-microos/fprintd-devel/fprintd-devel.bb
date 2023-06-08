SUMMARY = "Development files for fprintd"
DESCRIPTION = "Development documentation for fprintd, the D-Bus service for \
fingerprint readers access."
LICENSE = "GFDL-1.1-or-later"

PV = "1.94.2"

RPM_NAME = "fprintd-devel-1.94.2-2.4.noarch.rpm"
RPM_HASH = "04775d35cfc14260a80d4f6093eec5cd5c2ac5260e429af2c8d1a857189b8b5ede84b339b8b0527fd164f74ee675d9484fdca12b4af4419bc6ec588a184db9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fprintd-devel"
RDEPENDS:${PN} += "fprintd gtk-doc"

inherit rpm

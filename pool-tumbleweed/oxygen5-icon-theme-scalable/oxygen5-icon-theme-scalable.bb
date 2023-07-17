SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "oxygen5-icon-theme-scalable-5.108.0-1.1.noarch.rpm"
RPM_HASH = "4fceffae0800df4bfd6a12a3833197050d4deb8cc4a612d9946d33d604b7b621f94a760fd677bdf555004739ba4c1f8cf2f9606ba68a2759b7f9bd8b6d9cf8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-scalable \
oxygen5-icon-theme-scalable"

RDEPENDS:${PN} += "/usr/bin/bash \
oxygen5-icon-theme"

inherit rpm

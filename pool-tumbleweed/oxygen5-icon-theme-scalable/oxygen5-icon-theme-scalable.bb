SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "oxygen5-icon-theme-scalable-5.107.0-1.1.noarch.rpm"
RPM_HASH = "a613730c8d98c94894a8e30a9fbfb552f96ad78cce9053e9bff05af20b728400591db80d931b81f2c895c7fa068f69ab859fe108cbcfa9225c92c5ed1cc56afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme-scalable \
oxygen5-icon-theme-scalable"

RDEPENDS:${PN} += "/usr/bin/bash \
oxygen5-icon-theme"

inherit rpm

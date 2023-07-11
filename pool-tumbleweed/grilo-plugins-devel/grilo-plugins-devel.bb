SUMMARY = "Development files for Grilo plugins"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugins-devel-0.3.16-1.2.aarch64.rpm"
RPM_HASH = "311523f957b055956ffe0cfc70e743a5cff8e67bfa44338a9316f2343c8ef02e0dbd1966204fe7bf905fa5b4bddada64c726b0197a9b3640856014974b631ae6"

RPROVIDES:${PN} += "grilo-plugins-devel \
pkgconfig-grilo-plugins-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
grilo-plugin-dleyna \
grilo-plugin-tracker \
grilo-plugins"

inherit rpm

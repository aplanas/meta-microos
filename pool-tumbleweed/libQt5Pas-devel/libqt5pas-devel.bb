SUMMARY = "Free Pascal interface to Qt5"
DESCRIPTION = "Development files for Free Pascal interface to Qt5."
LICENSE = "LGPL-3.0-only"

PV = "2.2.6"

RPM_NAME = "libQt5Pas-devel-2.2.6-1.4.aarch64.rpm"
RPM_HASH = "a66a699e1cd6748859f7110f6c4614ddb5a9ef8ad631566f5a18503297a1c56129ade2bdb26766690af0386814b456a1db1aed0b8968a05536785ce893931f46"

RPROVIDES:${PN} += "libQt5Pas-devel"

RDEPENDS:${PN} += "libQt5Pas1"

inherit rpm

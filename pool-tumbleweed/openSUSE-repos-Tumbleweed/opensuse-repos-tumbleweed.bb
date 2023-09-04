SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20230810.a7534f6"

RPM_NAME = "openSUSE-repos-Tumbleweed-20230810.a7534f6-1.1.aarch64.rpm"
RPM_HASH = "fe0246ffec43bee2eea9b8296d1194e82caea724933b2761dbce0ff6ef1694179123ec1f1230763edc2d79ee38cfead2decf6c39fe7d36d8c05e8e894400da39"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-Tumbleweed"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm

SUMMARY = "Python module for systemd's service notification protocol"
DESCRIPTION = "A pure Python implementation of systemd's service notification protocol (sd_notify)"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-sdnotify-0.3.2-2.7.noarch.rpm"
RPM_HASH = "5dde2db2e4677633ad382df888bb3dc479a2d979df31a8d80b8e7c496c60bef9ac41d7628b37816832fc2ca3d0f6254abdbaeb50ba09b772ff120931d28773a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sdnotify) \
python311-sdnotify \
python3dist(sdnotify)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

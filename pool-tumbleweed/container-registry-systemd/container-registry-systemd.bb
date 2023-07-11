SUMMARY = "Systemd service files and config files for container-registry"
DESCRIPTION = "This package contains the configuration files, systemd units and scripts \
to run the openSUSE container registry managed by systemd."
LICENSE = "GPL-3.0-or-later"

PV = "0.0+git20220603.70601f6"

RPM_NAME = "container-registry-systemd-0.0+git20220603.70601f6-1.4.noarch.rpm"
RPM_HASH = "3704ceb2737e2c78d3244f1090c47790302b77f0f32afb479679f8f2308e1c77a4612d1c2d815f56e29edad4f0461b3807e194ad3c962602cd41bdfb182f2605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-registry-systemd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
certstrap"

inherit rpm

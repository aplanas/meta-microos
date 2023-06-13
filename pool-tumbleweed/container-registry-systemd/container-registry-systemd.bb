SUMMARY = "Systemd service files and config files for container-registry"
DESCRIPTION = "This package contains the configuration files, systemd units and scripts \
to run the openSUSE container registry managed by systemd."
LICENSE = "GPL-3.0-or-later"

PV = "0.0+git20220603.70601f6"

RPM_NAME = "container-registry-systemd-0.0+git20220603.70601f6-1.3.noarch.rpm"
RPM_HASH = "351e3773b11a155cca5b630ed55630bd990dd60dddbe8cd20613aa8713b9a00d751dbbfb0621731c5f0f9051c76212e23839a70500735348d63af80917f645e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-registry-systemd"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
certstrap"

inherit rpm

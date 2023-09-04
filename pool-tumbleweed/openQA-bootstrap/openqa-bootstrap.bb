SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-bootstrap-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "2007ada98b23abd9c9fa437fa61c66c7ef0df5f105d9550534f2bb13d752977d3774f93ee00c5161f50e0abd74d71c0bdc187afe48b3be77bef4d503e805f670"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

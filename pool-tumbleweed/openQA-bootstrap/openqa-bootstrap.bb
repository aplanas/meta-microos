SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-bootstrap-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "9bdcf31d2031bda4c7e95e4b047cfab649d008755a1aa275374a83a88ded040274d5e506825876e1b186d52c027b7d7622271232d40c5d4c4a728ed6a4898ee7"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

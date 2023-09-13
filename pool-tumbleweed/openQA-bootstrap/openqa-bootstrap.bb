SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1694101660.598baea"

RPM_NAME = "openQA-bootstrap-4.6.1694101660.598baea-1.1.aarch64.rpm"
RPM_HASH = "5d07c8c3b9ceb053391ecfb9ec8f61811e781f9eee23eb607e23e11df897b83de423aa92fcd6980495a37a83f79ee11b522c33cbd5e94fe885a55bc81b79b470"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

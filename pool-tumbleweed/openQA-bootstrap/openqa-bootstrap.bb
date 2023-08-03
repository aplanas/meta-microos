SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-bootstrap-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "fdd8bf6cec1765b192eb85edb9abb1f245cccad4885f026198919ef8d2b7f7eabfd833146b78c9b7a115894d9f51c0450c2b6d18a0328aab29dc80d4c2fa0a3a"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

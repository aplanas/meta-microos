SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688565452.efc15ea"

RPM_NAME = "openQA-bootstrap-4.6.1688565452.efc15ea-1.1.aarch64.rpm"
RPM_HASH = "0c1d84b28df468c15b625edfabff53d054b0046ce61dba7a468506f6741747f2fdb941580ceea09f0bc600199cce6ca74d2ab8107ffb2e9631f931413d787688"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

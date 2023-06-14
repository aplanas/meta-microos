SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1685738164.28716cd"

RPM_NAME = "openQA-bootstrap-4.6.1685738164.28716cd-1.1.aarch64.rpm"
RPM_HASH = "38250d3307e0dfcf9c833c36c0080094da97cc5c133e96a8585257d06a77075831daafbec34c6b4a8d78644e6e26f1a7afbcb40a9ddc59c3db80ac28f711d07d"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm

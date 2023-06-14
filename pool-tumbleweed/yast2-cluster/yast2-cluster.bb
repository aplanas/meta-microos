SUMMARY = "Configuration of cluster"
DESCRIPTION = "-"
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-cluster-4.6.1-1.1.noarch.rpm"
RPM_HASH = "a5c6d2aa04ace1d6ecd79d602d32912cc74e30295e8bf288bee851dfaa4fc388c776e069dc8f0df8f0809ae947f21498e2a9b9d74c6ce5a5ef9c11357bf95a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-cluster"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
yast2 \
yast2-ruby-bindings"

inherit rpm

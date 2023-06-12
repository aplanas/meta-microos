SUMMARY = "Basic SuSEfirewall2 to FirewallD migration script"
DESCRIPTION = "This is a simple bash script aiming to provide a basic migration path from \
SuSEfirewall2 to FirewallD."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.4"

RPM_NAME = "susefirewall2-to-firewalld-0.0.4-2.9.noarch.rpm"
RPM_HASH = "067550f466db03640ee1f87c10432cd457542cdbf54341e7c5b8c43c34205d1e75f0a43bcf598b2a1781136ad4f951f947c80006f1c6e610d693e2ba5f754e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "susefirewall2-to-firewalld"
RDEPENDS:${PN} += "/bin/bash \
firewalld \
iptables"

inherit rpm

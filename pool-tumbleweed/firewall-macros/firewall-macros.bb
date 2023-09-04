SUMMARY = "FirewallD RPM macros"
DESCRIPTION = "This package provides the firewalld RPM macros file needed by packages \
which provide their own firewalld service files."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewall-macros-2.0.0-2.1.noarch.rpm"
RPM_HASH = "66d2cd91d594d9e85ea00dd340934fa7066857e00499656e72589c04cf2496e4c2dc65847e56597da8fe015ad889e709e54a14d616234dd8b1733d1f2ccbca3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewall-macros \
rpm-macro-firewalld-reload"

RDEPENDS:${PN} += ""

inherit rpm

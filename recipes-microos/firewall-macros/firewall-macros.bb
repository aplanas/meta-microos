SUMMARY = "FirewallD RPM macros"
DESCRIPTION = "This package provides the firewalld RPM macros file needed by packages \
which provide their own firewalld service files."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewall-macros-1.3.2-2.1.noarch.rpm"
RPM_HASH = "a82f4470759e1822c7d7dc32a0b2052014512646771ad21e004d7c85e10e975b8f11e71021606a46c466a3084d782f1f756ca105fed0d8a53dd8a95fc62cc4ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewall-macros \
rpm_macro(firewalld_reload)"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "FirewallD RPM macros"
DESCRIPTION = "This package provides the firewalld RPM macros file needed by packages \
which provide their own firewalld service files."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewall-macros-1.3.2-1.1.noarch.rpm"
RPM_HASH = "bf8ca754b7ccbc4fcd743b6620f1a16bc4f027025fd950015bc52cf7ad958dc4edd284ae42abc0f93d15449ff98ad2c406bbbcf08180dcc6cca73119a5134e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewall-macros rpm_macro(firewalld_reload)"
RDEPENDS:${PN} += ""

inherit rpm

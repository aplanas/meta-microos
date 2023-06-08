SUMMARY = "Core Plugins for DNF"
DESCRIPTION = "Core Plugins for DNF. This package enhances DNF with the builddep, config-manager, \
debug, debuginfo-install, download, groups-manager, \
needs-restarting, repoclosure, repograph, repomanage, and reposync commands. \
Additionally, it provides the generate_completion_cache passive plugin."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "dnf-plugins-core-4.3.1-2.1.noarch.rpm"
RPM_HASH = "6a42aac81429b005bc6719b262a08705dce9f748658dcf9ece1194c56d4151b9d490950cd4d0c14570e9926f3453b6139b745e9189816d90cc458dca945772f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(dnf-plugins-core) dnf-command(builddep) dnf-command(changelog) dnf-command(config-manager) dnf-command(copr) dnf-command(debug-dump) dnf-command(debug-restore) dnf-command(debuginfo-install) dnf-command(download) dnf-command(groups-manager) dnf-command(repoclosure) dnf-command(repodiff) dnf-command(repograph) dnf-command(repomanage) dnf-command(reposync) dnf-plugin-builddep dnf-plugin-config-manager dnf-plugin-debuginfo-install dnf-plugin-download dnf-plugin-generate_completion_cache dnf-plugin-groups-manager dnf-plugin-needs_restarting dnf-plugin-repoclosure dnf-plugin-repograph dnf-plugin-repomanage dnf-plugin-reposync dnf-plugins-core dnf-plugins-extras-debug dnf-plugins-extras-repoclosure dnf-plugins-extras-repograph dnf-plugins-extras-repomanage"
RDEPENDS:${PN} += "python3-dnf-plugins-core"

inherit rpm

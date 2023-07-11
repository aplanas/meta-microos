SUMMARY = "Python 3 interface to core plugins for DNF"
DESCRIPTION = "Core Plugins for DNF, Python 3 interface. This package enhances DNF with \
the builddep, config-manager, debug, debuginfo-install, \
download, groups-manager, needs-restarting, repoclosure, repograph, repomanage, \
and reposync commands. \
 \
Additionally, it provides the generate_completion_cache passive plugin."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugins-core-4.3.1-2.2.noarch.rpm"
RPM_HASH = "993792119acca5ba8baf3fedc185dee682c26f7a27f8a8a8c6337c8bdb40b2910feb71dd6f01312a1d7b6c1dbab422e5cfa9b874ccba079277a1ce870e855dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnf-plugins-core \
python3-dnf-plugins-extras-debug \
python3-dnf-plugins-extras-repoclosure \
python3-dnf-plugins-extras-repograph \
python3-dnf-plugins-extras-repomanage"

RDEPENDS:${PN} += "python-abi \
python3-dateutil \
python3-dbus-python \
python3-distro \
python3-dnf \
python3-hawkey"

inherit rpm

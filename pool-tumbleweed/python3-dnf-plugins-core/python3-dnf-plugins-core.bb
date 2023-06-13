SUMMARY = "Python 3 interface to core plugins for DNF"
DESCRIPTION = "Core Plugins for DNF, Python 3 interface. This package enhances DNF with \
the builddep, config-manager, debug, debuginfo-install, \
download, groups-manager, needs-restarting, repoclosure, repograph, repomanage, \
and reposync commands. \
 \
Additionally, it provides the generate_completion_cache passive plugin."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugins-core-4.3.1-2.1.noarch.rpm"
RPM_HASH = "f5caa873b6742e19b2d1bdc8f39207570b2db7f2a52b24bb59cdd084354479b15b71720174e241ebcc6134b0333e027b4f8c528628d22573ca69455656ab380b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnf-plugins-core \
python3-dnf-plugins-extras-debug \
python3-dnf-plugins-extras-repoclosure \
python3-dnf-plugins-extras-repograph \
python3-dnf-plugins-extras-repomanage"

RDEPENDS:${PN} += "python(abi) \
python3-dateutil \
python3-dbus-python \
python3-distro \
python3-dnf \
python3-hawkey"

inherit rpm

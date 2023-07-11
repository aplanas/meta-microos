SUMMARY = "Version Lock Plugin for DNF"
DESCRIPTION = "Version lock plugin takes a set of name/versions for packages and excludes all other \
versions of those packages. This allows you to e.g. protect packages from being \
updated by newer versions."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-versionlock-4.3.1-2.2.noarch.rpm"
RPM_HASH = "e51ed9f2f8db3df08371f69c48950bcd3abd3fc923842915f6de1a70611740746a820aa1badebc10431e3e5a2214d9ffc2e4536ada37cb2ae1d1cd16a35b3c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-versionlock \
dnf-command-versionlock \
dnf-plugin-versionlock \
dnf-plugins-extras-versionlock \
python3-dnf-plugin-versionlock \
python3-dnf-plugins-extras-versionlock \
yum-versionlock"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-core"

inherit rpm

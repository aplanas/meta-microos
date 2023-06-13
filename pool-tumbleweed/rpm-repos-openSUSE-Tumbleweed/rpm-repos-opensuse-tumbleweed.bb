SUMMARY = "openSUSE Tumbleweed package repositories"
DESCRIPTION = "openSUSE Tumbleweed package repository files for DNF and PackageKit."
LICENSE = "MIT"

PV = "1599"

RPM_NAME = "rpm-repos-openSUSE-Tumbleweed-1599-9.3.aarch64.rpm"
RPM_HASH = "e36d2836b4540da7ef690756bb81616dc9a3b291edb79b3507291ce8d2fd86156d37c6d1edb11095d06044b31e859fa386627e89f88a3d2f4de50d0bc150fcf2"

RPROVIDES:${PN} += "config(rpm-repos-openSUSE-Tumbleweed) \
rpm-repos-openSUSE \
rpm-repos-openSUSE-Tumbleweed \
rpm-repos-openSUSE-Tumbleweed(aarch-64)"

RDEPENDS:${PN} += "rpm-repo-keys-openSUSE \
suse-release"

inherit rpm

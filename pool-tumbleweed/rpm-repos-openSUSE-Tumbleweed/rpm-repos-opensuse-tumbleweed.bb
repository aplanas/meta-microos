SUMMARY = "openSUSE Tumbleweed package repositories"
DESCRIPTION = "openSUSE Tumbleweed package repository files for DNF and PackageKit."
LICENSE = "MIT"

PV = "1699"

RPM_NAME = "rpm-repos-openSUSE-Tumbleweed-1699-10.1.aarch64.rpm"
RPM_HASH = "ffffb027962c057785d6844011ba02af8a0f4e007324a774ea6ce780016a96e126085a3a31625b40646203143eec38c6e507c01d492298c04aaec3865896da53"

RPROVIDES:${PN} += "config-rpm-repos-openSUSE-Tumbleweed \
rpm-repos-openSUSE \
rpm-repos-openSUSE-Tumbleweed"

RDEPENDS:${PN} += "rpm-repo-keys-openSUSE \
suse-release"

inherit rpm

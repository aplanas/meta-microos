SUMMARY = "Enables Zypper repository configuration for DNF"
DESCRIPTION = "This package allows libdnf and all consumers to be able to reuse \
repository configuration files set for Zypper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "libdnf-repo-config-zypp-0.70.1-1.1.aarch64.rpm"
RPM_HASH = "db52bda2b1e73299c57f33e0940b35a35005a0b0e236305f42c0834acfadd0658dbb93de56e056d89518338824d32b7ee6e28138e5b7f4b5a949bc635dec9efd"

RPROVIDES:${PN} += "libdnf-repo-config-zypp \
libdnf-repo-config-zypp(aarch-64) \
rpm-repos-openSUSE"
RDEPENDS:${PN} += "(product(SUSE_SLE) or suse-release)"

inherit rpm

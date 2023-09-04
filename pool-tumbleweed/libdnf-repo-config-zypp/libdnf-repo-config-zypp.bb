SUMMARY = "Enables Zypper repository configuration for DNF"
DESCRIPTION = "This package allows libdnf and all consumers to be able to reuse \
repository configuration files set for Zypper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.2"

RPM_NAME = "libdnf-repo-config-zypp-0.70.2-1.1.aarch64.rpm"
RPM_HASH = "a4a4c2fd4809d82304160a609ab2e4e829529363fb5320dcff229803fa3497aee2865fc86bce3be7fc38aec3ac6c86bc45c258a20efc663b3b76a379895ed114"

RPROVIDES:${PN} += "libdnf-repo-config-zypp \
rpm-repos-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm

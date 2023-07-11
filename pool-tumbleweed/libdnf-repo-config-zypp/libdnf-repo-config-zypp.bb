SUMMARY = "Enables Zypper repository configuration for DNF"
DESCRIPTION = "This package allows libdnf and all consumers to be able to reuse \
repository configuration files set for Zypper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "libdnf-repo-config-zypp-0.70.1-1.2.aarch64.rpm"
RPM_HASH = "26dccb4123cee0b3c914bbd5518043f70195165ecaddca0ff896466e1a9488337e116afde157efb9a125989cdd48dc4bc4802fce1c4605937e31992a4d796183"

RPROVIDES:${PN} += "libdnf-repo-config-zypp \
rpm-repos-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "SUSE Brand File Supplementing Upstream Look and Feel"
DESCRIPTION = "This package contains the file /usr/etc/SUSE-brand, and its name is used as \
a trigger for installation of look and feel and branding of packages as \
it was defined by upstream developers. \
 \
WARNING: If you decide to install this package instead of the default \
branding package, you will lose vendor customization of your \
distribution."
LICENSE = "MIT"

PV = "16.0"

RPM_NAME = "branding-upstream-16.0-1.7.noarch.rpm"
RPM_HASH = "be41903f3135c73611ba15b6d8dcf065b87509ace6931c01c46c57c5d3b1d38590d74ed1c99d164b23821d349d553e6afae8447bb25eaff775868c918d6f5514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "branding branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm

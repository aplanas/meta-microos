SUMMARY = "Supportconfig Analysis Patterns for SLE15"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SLE15. \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "sca-patterns-sle15-1.5.5-1.1.noarch.rpm"
RPM_HASH = "d2bd74ce2bb7cdf3670461ba7e54b5765136c79dd1e291b4350b8689e755ce3cde5be435e5a732f80af95ad94fb2d97b2fcfae6c9bc7079ac1b1539a7c335348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-sle15"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
sca-patterns-base"

inherit rpm

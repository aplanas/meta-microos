SUMMARY = "Cross-vendor public domain suffix database"
DESCRIPTION = "The Public Suffix List is a cross-vendor initiative to provide \
an accurate list of domain name suffixes, maintained by the hard work \
of Mozilla volunteers and by submissions from registries. \
Software using the Public Suffix List will be able to determine where \
cookies may and may not be set, protecting the user from being \
tracked across sites."
LICENSE = "MPL-2.0"

PV = "20230717"

RPM_NAME = "publicsuffix-20230717-1.1.noarch.rpm"
RPM_HASH = "7c00070c7ff15e790ad48d9354b720d7b80ff27470fdbc799ab3e5d5a274bbd76298041692444e80e5f578c6e24b5cba573185d7989267d3e13b2ef69d128b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "publicsuffix"

RDEPENDS:${PN} += ""

inherit rpm

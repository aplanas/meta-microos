SUMMARY = "Cross-vendor public domain suffix database"
DESCRIPTION = "The Public Suffix List is a cross-vendor initiative to provide \
an accurate list of domain name suffixes, maintained by the hard work \
of Mozilla volunteers and by submissions from registries. \
Software using the Public Suffix List will be able to determine where \
cookies may and may not be set, protecting the user from being \
tracked across sites."
LICENSE = "MPL-2.0"

PV = "20230826"

RPM_NAME = "publicsuffix-20230826-1.1.noarch.rpm"
RPM_HASH = "f23643ec10d788144769a81563bbb0a3963287963f52907df1d863583da108c668f6911bada40272f27cecc38d6036cfd49f9d9dd4e6fc940b9cbaf01b331ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "publicsuffix"

RDEPENDS:${PN} += ""

inherit rpm

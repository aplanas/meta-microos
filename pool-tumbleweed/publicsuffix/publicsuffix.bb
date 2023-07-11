SUMMARY = "Cross-vendor public domain suffix database"
DESCRIPTION = "The Public Suffix List is a cross-vendor initiative to provide \
an accurate list of domain name suffixes, maintained by the hard work \
of Mozilla volunteers and by submissions from registries. \
Software using the Public Suffix List will be able to determine where \
cookies may and may not be set, protecting the user from being \
tracked across sites."
LICENSE = "MPL-2.0"

PV = "20230616"

RPM_NAME = "publicsuffix-20230616-1.1.noarch.rpm"
RPM_HASH = "a29879562696ed0f2300664e5dc9b01dfb402cd63b5b93245306c35f7ddc9f9b697aca028fd4a776625d951c46b9f7355fda99a63b9a2a95e27c3920a4f6be3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "publicsuffix"

RDEPENDS:${PN} += ""

inherit rpm

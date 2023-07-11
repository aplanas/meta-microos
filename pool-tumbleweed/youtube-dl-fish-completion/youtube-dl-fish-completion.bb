SUMMARY = "Fish completion for youtube-dl"
DESCRIPTION = "Fish command line completion support for youtube-dl."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-fish-completion-2021.12.17-8.1.noarch.rpm"
RPM_HASH = "8945662380cdd9d3c6a08b53e39ca1f7ace552a8824dadd10d01b74e3e29f14bdf329c30d5eebd7c23300d97e5f0744a4a8bf1966bf04f1a282ae23a4ea20e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm

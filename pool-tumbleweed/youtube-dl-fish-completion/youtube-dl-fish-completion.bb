SUMMARY = "Fish completion for youtube-dl"
DESCRIPTION = "Fish command line completion support for youtube-dl."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-fish-completion-2021.12.17-7.1.noarch.rpm"
RPM_HASH = "4a1e0e79dc3c97a27a4bec5d62fc88202118e2a7318b87b8783fef59a8b31b566827e399209017ffca0d1aa0b62a7c34d7dd94a6ac5ac3f4e9f9b10e64f6beb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm

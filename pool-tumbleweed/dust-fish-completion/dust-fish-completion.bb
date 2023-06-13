SUMMARY = "Fish completion for dust"
DESCRIPTION = "Fish command line completion support for dust."
LICENSE = "Apache-2.0"

PV = "0.8.6"

RPM_NAME = "dust-fish-completion-0.8.6-1.1.noarch.rpm"
RPM_HASH = "83e4acda3d2fb2a919b00fb33830ffaf9a2c5e1d554be16ec20ccc891a4230b91e4998907e9a86f5fdda9cae8424aceae4a47890d700ce5caadb0db40c1e1c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dust-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm

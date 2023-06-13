SUMMARY = "Fish completion for skopeo"
DESCRIPTION = "This package contains the fish completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "skopeo-fish-completion-1.12.0-1.1.noarch.rpm"
RPM_HASH = "1614dc6c8823b4f15c713a7e7cdfc1046b226699c2f94d99795c82f1e749927c809e43858dc6cd1e72429b6531fa8aad35e3ed34dc347f586805edc24f79ad50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-fish-completion"

RDEPENDS:${PN} += "fish \
skopeo"

inherit rpm

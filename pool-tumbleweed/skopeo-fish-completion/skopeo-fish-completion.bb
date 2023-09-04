SUMMARY = "Fish completion for skopeo"
DESCRIPTION = "This package contains the fish completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.13.2"

RPM_NAME = "skopeo-fish-completion-1.13.2-1.1.noarch.rpm"
RPM_HASH = "73a4587fdfdaa1f1283e3563f6959dfd4732dd507f428aa5f9b01af5a7620391853f0b8ae03f229758033fdc7568d8bb2763fc5d32a142f79cef1609f502d10d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-fish-completion"

RDEPENDS:${PN} += "fish \
skopeo"

inherit rpm

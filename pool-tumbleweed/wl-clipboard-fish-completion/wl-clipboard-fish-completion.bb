SUMMARY = "Fish completion for wl-clipboard"
DESCRIPTION = "Fish command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.2.0"

RPM_NAME = "wl-clipboard-fish-completion-2.2.0-1.1.noarch.rpm"
RPM_HASH = "f52610ded42f9eec87fe92418e304aa33a53e39e9c6fc53b0e1f95dc38221eec3dc68bf88ed3103293c920222d74e37904febed3afd9b1d20e5d7e9165a132a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-fish-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm

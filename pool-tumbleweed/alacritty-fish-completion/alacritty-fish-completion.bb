SUMMARY = "Fish Completion for alacritty"
DESCRIPTION = "The official fish completion script for alacritty."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "alacritty-fish-completion-0.12.1-1.1.noarch.rpm"
RPM_HASH = "f8131c1674a5c6670d3400abfd9c958aefbb7dcf1ba8ba3bcee45d8296d17b28aa7f89214fc62e3111fd8830b485bd3bb5ebee5f31eb036a97618576ce0f9eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm

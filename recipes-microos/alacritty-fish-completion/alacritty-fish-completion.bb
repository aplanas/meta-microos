SUMMARY = "Fish Completion for alacritty"
DESCRIPTION = "The official fish completion script for alacritty."
LICENSE = "Apache-2.0"

PV = "0.12.0"

RPM_NAME = "alacritty-fish-completion-0.12.0-1.1.noarch.rpm"
RPM_HASH = "21041be700c68a05fd22a2cef4a255450b2dc578b195212770dd4e4433d310c23b32f4a2d889160c921b2818da2b7c1d84e299d24daf9312f1c1e80465c0b977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm

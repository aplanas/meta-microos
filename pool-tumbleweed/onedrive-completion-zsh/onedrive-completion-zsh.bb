SUMMARY = "OneDrive zsh completition"
DESCRIPTION = "OneDrive shell completions for zsh."
LICENSE = "GPL-3.0-only"

PV = "2.4.25"

RPM_NAME = "onedrive-completion-zsh-2.4.25-1.1.aarch64.rpm"
RPM_HASH = "93a5a70c7f76bca54ebb849b2ff9671f114f240de7a2ed2370af74b82288fdd009ac402486cbdf2dc8f3155de84df6fccf10c7428fca5bf6ac136a0ff797ebc1"

RPROVIDES:${PN} += "onedrive-completion-zsh"

RDEPENDS:${PN} += "zsh"

inherit rpm

SUMMARY = "A multi-host manager for dotfiles"
DESCRIPTION = "chezmoi is a manager for personal preference configs and state files \
('dotfiles') that programs such as editors might create. chezmoi \
sources dotfiles from a GitHub repository and installs them onto new, \
empty machines."
LICENSE = "MIT"

PV = "2.35.0"

RPM_NAME = "chezmoi-2.35.0-1.1.aarch64.rpm"
RPM_HASH = "1888a2fb3e2621072b71c898cdc86cc3ef5f1a5ac496cf8d1ea228c4f46dfb1c18c7d5fc84c589a97a2013c47dbe763847ed22de297e578ee598371b0eb82250"

RPROVIDES:${PN} += "chezmoi"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

SUMMARY = "A multi-host manager for dotfiles"
DESCRIPTION = "chezmoi is a manager for personal preference configs and state files \
('dotfiles') that programs such as editors might create. chezmoi \
sources dotfiles from a GitHub repository and installs them onto new, \
empty machines."
LICENSE = "MIT"

PV = "2.38.0"

RPM_NAME = "chezmoi-2.38.0-1.1.aarch64.rpm"
RPM_HASH = "9fe1ccdac1a6b28ed2eb9c1259f80ec9a2fb8177cc2e67e707b94560902a0f9dd3829f251fe91e3214ae8df5279736a1952bc3fde587496be72f1ce5627bc242"

RPROVIDES:${PN} += "chezmoi"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

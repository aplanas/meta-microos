SUMMARY = "A multi-host manager for dotfiles"
DESCRIPTION = "chezmoi is a manager for personal preference configs and state files \
('dotfiles') that programs such as editors might create. chezmoi \
sources dotfiles from a GitHub repository and installs them onto new, \
empty machines."
LICENSE = "MIT"

PV = "2.37.0"

RPM_NAME = "chezmoi-2.37.0-1.1.aarch64.rpm"
RPM_HASH = "877c37ba929953a2bb5605d68c63097ef8b7c4831706a56ef4846b509cdf506fe17e49af474c71dd62bc0b5f45eb2255ab4f384d32b1a1d996014b6971741ea1"

RPROVIDES:${PN} += "chezmoi"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

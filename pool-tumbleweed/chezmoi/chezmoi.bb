SUMMARY = "A multi-host manager for dotfiles"
DESCRIPTION = "chezmoi is a manager for personal preference configs and state files \
('dotfiles') that programs such as editors might create. chezmoi \
sources dotfiles from a GitHub repository and installs them onto new, \
empty machines."
LICENSE = "MIT"

PV = "2.36.1"

RPM_NAME = "chezmoi-2.36.1-1.1.aarch64.rpm"
RPM_HASH = "bfedf85c7cc3a3636498fdce56a1b11ce68650b48a20084c2fab46f21c530022a4faed867443f6ad78db63546af3debcf17a78d7dbc3911c8751856426901125"

RPROVIDES:${PN} += "chezmoi"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

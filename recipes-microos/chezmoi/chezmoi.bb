SUMMARY = "A multi-host manager for dotfiles"
DESCRIPTION = "chezmoi is a manager for personal preference configs and state files \
('dotfiles') that programs such as editors might create. chezmoi \
sources dotfiles from a GitHub repository and installs them onto new, \
empty machines."
LICENSE = "MIT"

PV = "2.33.4"

RPM_NAME = "chezmoi-2.33.4-1.1.aarch64.rpm"
RPM_HASH = "49f5a6a55e56a63dac35d8203942b2da0b95c638e67cf58500114fc05f5b94c0fc2a188697acfc031d7d833be65dfa6c863bac9d3c3944c4dd3b4657de120f83"

RPROVIDES:${PN} += "chezmoi chezmoi(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

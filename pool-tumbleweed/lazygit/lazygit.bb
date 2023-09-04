SUMMARY = "Simple terminal UI for git commands"
DESCRIPTION = "lazygit is a terminal UI for git commmands that helps make common and complex \
git operations easy and accessible without requiring expertise with the git \
command line."
LICENSE = "MIT"

PV = "0.40.2"

RPM_NAME = "lazygit-0.40.2-1.1.aarch64.rpm"
RPM_HASH = "7fb771f3b34c9df939d5041e3b51e5d482a4d10e9ba92af783cd0102e7e61b1cdc42c371892105d88c79cfa995c675cfd63143f63c009341851325624fda72df"

RPROVIDES:${PN} += "lazygit"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm

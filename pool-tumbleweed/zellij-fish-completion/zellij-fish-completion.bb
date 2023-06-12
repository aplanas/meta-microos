SUMMARY = "Fish Completion for zellij"
DESCRIPTION = "Fish command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.36.0"

RPM_NAME = "zellij-fish-completion-0.36.0-1.1.noarch.rpm"
RPM_HASH = "d7c214721d30070514b2a843ba538324c12710c8d6c3e3de79115383e685ea1bfcd531165c797c5f57ffaf4b32ae47604decc2d8536ebd2fe209511faa96f9a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm

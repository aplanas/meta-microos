SUMMARY = "Fish completion for chezmoi"
DESCRIPTION = "Fish command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.34.3"

RPM_NAME = "chezmoi-fish-completion-2.34.3-1.1.noarch.rpm"
RPM_HASH = "94c3550852b4353ec4f7ce4d7dd1dc40da5d781cb8867780cb15df53d51d10ef5ccb25065fe3e9ce09d0fdebd7d239b640aad2f0a1cb42def33accb3ea853461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-fish-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm

SUMMARY = "Fish, Bash, Zsh and PowerShell completion for Click"
DESCRIPTION = "Fish, Bash, Zsh and PowerShell completion for Click."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python311-click-completion-0.5.2-1.13.noarch.rpm"
RPM_HASH = "c38540522fe2994f86cea997874dc67124d62fe4eeb53adb9bdd9079f0a5e3a95d2ff7e4d5cfc113d63ccfa9915f7cedace5a053ea7b9fbaac1ae9ece1ac4505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-completion) \
python311-click-completion \
python3dist(click-completion)"

RDEPENDS:${PN} += "python(abi) \
python311-Jinja2 \
python311-click \
python311-shellingham \
python311-six"

inherit rpm

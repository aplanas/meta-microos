SUMMARY = "Fish, Bash, Zsh and PowerShell completion for Click"
DESCRIPTION = "Fish, Bash, Zsh and PowerShell completion for Click."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python39-click-completion-0.5.2-1.14.noarch.rpm"
RPM_HASH = "c1c8083e33cda40891d80bdf021e638e5c727c92571ebf1a186c7d80c9293e6cbbeb6d0aea3790649fa1adbaf8b390d5baa07ed66d4faf3d6efe5f8a83761828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-completion \
python39-click-completion \
python3dist-click-completion"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-click \
python39-shellingham \
python39-six"

inherit rpm

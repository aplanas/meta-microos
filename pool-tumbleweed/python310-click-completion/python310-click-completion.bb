SUMMARY = "Fish, Bash, Zsh and PowerShell completion for Click"
DESCRIPTION = "Fish, Bash, Zsh and PowerShell completion for Click."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python310-click-completion-0.5.2-1.14.noarch.rpm"
RPM_HASH = "39cc4bf2e4a77296aa3f7fb494025aad67ac3c7face92ecd67dd08ac332626318685b8701552930d4f2173bd2dd02f6fba4371374286b991f0f28229c425844d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-completion \
python310-click-completion \
python3dist-click-completion"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-click \
python310-shellingham \
python310-six"

inherit rpm

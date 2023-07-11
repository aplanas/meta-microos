SUMMARY = "Fish, Bash, Zsh and PowerShell completion for Click"
DESCRIPTION = "Fish, Bash, Zsh and PowerShell completion for Click."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python311-click-completion-0.5.2-1.14.noarch.rpm"
RPM_HASH = "97001bdf523ec97439310649d5cfc1e38ceba322530615305417156d07fd40f3240cbebe4e7d2322ea8b1a56065137164fdb4a7bf72a5cf4d19706bd46e9a950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-completion \
python3.11dist-click-completion \
python311-click-completion \
python3dist-click-completion"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-click \
python311-shellingham \
python311-six"

inherit rpm

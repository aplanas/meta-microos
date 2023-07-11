SUMMARY = "Bash completion for khal"
DESCRIPTION = "Bash shell completions for khal"
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python-khal-bash-completion-0.10.5-3.5.noarch.rpm"
RPM_HASH = "9e56f6a3649af242d20af5e42ee381f97c27693ccaec44b50df5d064fcff14f2cde5547ff8b01927bd351d747c65e320989cbd01f281b789132286136792cfa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-khal-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

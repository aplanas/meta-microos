SUMMARY = "Bash Completion for zellij"
DESCRIPTION = "Bash command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.37.2"

RPM_NAME = "zellij-bash-completion-0.37.2-1.1.noarch.rpm"
RPM_HASH = "ffa8fd024622a05e13b4fbab2cee6fa6dc9cee7c319c7ee24edde43d5806b2d5660a852a7b13c862b8a55df4f9cbdb1a38864d7cb14170904f852a3b63debd8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

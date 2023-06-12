SUMMARY = "Bash Completion for tealdeer"
DESCRIPTION = "Bash command-line completion support for tealdeer."
LICENSE = "Apache-2.0 | MIT"

PV = "1.6.1"

RPM_NAME = "tealdeer-bash-completion-1.6.1-2.1.noarch.rpm"
RPM_HASH = "32f472e94d74b15f6a007c0360121b9ed45a88709d8fc5855fe3ca345edde15a885bc52943078dc617a56edd22dadbf4f4d007d145623d90acb70a0f5d3df3a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tealdeer-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm

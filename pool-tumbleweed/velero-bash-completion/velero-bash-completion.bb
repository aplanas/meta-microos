SUMMARY = "Bash Completion for velero"
DESCRIPTION = "Bash command line completion support for velero."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "velero-bash-completion-1.9.2-1.3.noarch.rpm"
RPM_HASH = "016f9964fb7b58fe22f7f49f93963f445132c8fc4f57253509bdedf35d636c9a0d0e58324227038407068fc25e13eded5031a07a485da44408d292101eea22e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velero-bash-completion"
RDEPENDS:${PN} += "velero"

inherit rpm

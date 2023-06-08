SUMMARY = "Bash completion for android-tools"
DESCRIPTION = "Bash command line completion support for android-tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.0"

RPM_NAME = "android-tools-bash-completion-34.0.0-1.2.noarch.rpm"
RPM_HASH = "34c3b4f8fc3d32eeb4440a80c17ca4d5bb51a5bcc5aa0a5754b2d8e9c178a253d86ee23ab595b88abb7d191a5c62bc8be00b59072317551ce9b09d150c50ea2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm

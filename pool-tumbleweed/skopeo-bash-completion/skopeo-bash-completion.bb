SUMMARY = "Bash completion for skopeo"
DESCRIPTION = "This package contains the bash completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.13.2"

RPM_NAME = "skopeo-bash-completion-1.13.2-1.1.noarch.rpm"
RPM_HASH = "03367abc344acb83f40270bbf9b1df6cec4b1356c40d2518b49fd7e354563109ec78d049f9e969be37f3f5dc0188bb4add23d247a6c06c21cf8084c943c3ba53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skopeo"

inherit rpm

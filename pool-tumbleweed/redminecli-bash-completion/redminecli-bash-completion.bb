SUMMARY = "Bash completion for redminecli"
DESCRIPTION = "This package contains the bash completion command for redminecli."
LICENSE = "CECILL-B"

PV = "1.3.0"

RPM_NAME = "redminecli-bash-completion-1.3.0-1.11.noarch.rpm"
RPM_HASH = "4154b8558f826d9b05f6d6b76287c7d0e15e2f1e2f5f6e49de5de795d20851ed7bfae53d8e032cd27b5da17a31ec39fdfdee7f691cbec4ffb2b2468afaf6f98f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redminecli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
redminecli"

inherit rpm

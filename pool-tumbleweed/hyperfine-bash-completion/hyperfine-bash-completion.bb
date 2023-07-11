SUMMARY = "Bash Completion for hyperfine"
DESCRIPTION = "The official bash completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.17.0"

RPM_NAME = "hyperfine-bash-completion-1.17.0-1.1.noarch.rpm"
RPM_HASH = "1c19603d0ec1bcdab93ed9c43ef0798779067bad2025a8882f1bcffe2aeb5ffb8b1e7f652c4bfeae5944a8c88c8fd6f4f48f0f3789f6eebbcb901c44140cee6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

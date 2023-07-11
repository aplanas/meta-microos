SUMMARY = "Bash Completion for erlang-rebar3"
DESCRIPTION = "The official bash completion script for rebar3."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "erlang-rebar3-bash-completion-3.18.0-1.2.noarch.rpm"
RPM_HASH = "d635d9fd03c1f19f3579eb361a1b929bad5a1c6a9a72dcf57c9962eddc379f0490e1c85923463311585bf0a48bea010fc5cf275b6002dcb900100040ee2776ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "erlang-rebar3-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

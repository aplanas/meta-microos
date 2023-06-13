SUMMARY = "Bash Completion for erlang-rebar3"
DESCRIPTION = "The official bash completion script for rebar3."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "erlang-rebar3-bash-completion-3.18.0-1.1.noarch.rpm"
RPM_HASH = "d315c39859ee6c036f776ae5327e73836c8c9777356309ed1e34e8a71bf1ed8ba6b213785f7fd83b407558f3de1f2f2b16cd68612c29774f53a4666aee6acad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "erlang-rebar3-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

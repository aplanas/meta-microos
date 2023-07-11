SUMMARY = "ZSH Completion for erlang-rebar3"
DESCRIPTION = "The official zsh completion script for rebar3."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "erlang-rebar3-zsh-completion-3.18.0-1.2.noarch.rpm"
RPM_HASH = "2ce3926516e975c28b6a1651121da01357cd899b7d21cb423ab942f32ce16ef67fa7cdfc808dbf4dddaeb44d2e63ee84b5787c8f3f009b6e7c1d1737c8dc0b69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "erlang-rebar3-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "ZSH Completion for erlang-rebar3"
DESCRIPTION = "The official zsh completion script for rebar3."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "erlang-rebar3-zsh-completion-3.18.0-1.1.noarch.rpm"
RPM_HASH = "820450d3ec015d50a839a6c20050ef596f322cff9c717a7d4f037a47939a928f5f19a07fb7b57896e5860aa47b14fdb4f538e41e22bbd8b451a26271d86bc14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "erlang-rebar3-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Fish Completion for erlang-rebar3"
DESCRIPTION = "The official fish completion script for rebar3."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "erlang-rebar3-fish-completion-3.18.0-1.1.noarch.rpm"
RPM_HASH = "45af6acb3a8b4940153c598333d75dcd1ea5e06e605ee211b6db32e26dc053b5f7e0d638c43e99db7ee5ef28ac7b3397ae91e223fa81cc3905ae478379a0f4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "erlang-rebar3-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm

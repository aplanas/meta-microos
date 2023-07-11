SUMMARY = "Fish Completion for erlang-rebar3"
DESCRIPTION = "The official fish completion script for rebar3."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "erlang-rebar3-fish-completion-3.18.0-1.2.noarch.rpm"
RPM_HASH = "b0691cf09db294818136fb9bcbb566c43fdbdfeacf0d67152b41cb79a2da1181c50848e145b61b1c8150c41f5a40a0b34719a92cfb23bdc392a2c83296082041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "erlang-rebar3-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm

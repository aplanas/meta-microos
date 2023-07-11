SUMMARY = "The zsh completion for etckeeper"
DESCRIPTION = "zsh command line completion support for etckeeper."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.18"

RPM_NAME = "etckeeper-zsh-completion-1.18.18-2.3.noarch.rpm"
RPM_HASH = "7b1fd03fc2d54659b35edb3dabcd544c2236f2d8501c6398fd092fad0f7b8f79d6d5ae98659e47a7ed267a512f8f57d3edc614bfbbbdf19e945fc5c01ce5c87d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etckeeper-zsh-completion"

RDEPENDS:${PN} += "etckeeper"

inherit rpm

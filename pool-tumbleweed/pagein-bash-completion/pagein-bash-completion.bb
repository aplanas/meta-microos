SUMMARY = "Bash Completion for pagein"
DESCRIPTION = "Bash completion script for pagein."
LICENSE = "GPL-2.0-only"

PV = "0.01.09"

RPM_NAME = "pagein-bash-completion-0.01.09-1.2.noarch.rpm"
RPM_HASH = "f648dd63638fecf2c8d9276486356e91e445339c79de10a672d51de35295eb26816f49276ce956dc4a7be023056346f68dd0ea51a9caf344453f4e4852421bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagein-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pagein"

inherit rpm

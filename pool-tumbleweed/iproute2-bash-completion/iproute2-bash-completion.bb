SUMMARY = "Bash completion for iproute"
DESCRIPTION = "bash command line completion support for iproute."
LICENSE = "GPL-2.0-or-later"

PV = "6.4"

RPM_NAME = "iproute2-bash-completion-6.4-1.1.aarch64.rpm"
RPM_HASH = "0566dfefb4900d897866fff7731f35c38e1997526a38aaa883a04234a0b8132b8ff41e434e0ef27c23584b6d8da66446b95ecca570fc243d9a080fe72ffff150"

RPROVIDES:${PN} += "iproute2-bash-completion"

RDEPENDS:${PN} += "bash-completion \
iproute2"

inherit rpm

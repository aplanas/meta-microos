SUMMARY = "Bash completion for bpftool"
DESCRIPTION = "bash command line completion support for bpftool."
LICENSE = "GPL-2.0-only"

PV = "7.2.0"

RPM_NAME = "bpftool-bash-completion-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "2a6d239904fc7393e35281220d5ff2309f03fcbb00c059ddc0418a15ff8b94098c7c54d7c67f454b27ab6c8200c18f41c1dd1040a414e903e70d15db4446c784"

RPROVIDES:${PN} += "bpftool-bash-completion"

RDEPENDS:${PN} += "bash-completion \
bpftool"

inherit rpm

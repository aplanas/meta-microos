SUMMARY = "Bash completion for btrfsprogs"
DESCRIPTION = "bash command line completion support for btrfsprogs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-bash-completion-6.3-3.1.aarch64.rpm"
RPM_HASH = "f47891344a90ba2801ab30b4f87adbf6f1e678b4d2be646b1e0fd21e7f25550c1f38b05c27012773d5b5bae36ffaec4b98f9371754c4dc9e16dc20f6815987b9"

RPROVIDES:${PN} += "btrfsprogs-bash-completion"

RDEPENDS:${PN} += "bash-completion \
btrfsprogs"

inherit rpm

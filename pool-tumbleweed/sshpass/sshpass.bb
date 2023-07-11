SUMMARY = "Non-interactive SSH authentication utility"
DESCRIPTION = "Tool for non-interactively performing password authentication with so called \
'interactive keyboard password authentication' of SSH. Most users should use \
more secure public key authentication of SSH instead."
LICENSE = "GPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "sshpass-1.10-1.3.aarch64.rpm"
RPM_HASH = "572c4170ca0113381f5fb8e5533940a0f01f396783ce74447e4e17cd2ee063a25b1f27d346986a2cf5cbd35e871cafe7545950882c02051db5e1fa9017009431"

RPROVIDES:${PN} += "sshpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

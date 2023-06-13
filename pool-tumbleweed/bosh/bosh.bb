SUMMARY = "Multibyte-capable POSIX-conforming Bourne shell"
DESCRIPTION = "bosh is a Bourne-style POSIX command interpreter (shell), similar to dash, \
but supports multibyte input/output."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "bosh-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "b8c139c8b30384514348f6c18c326e5349546bdea3292eee5d9d040689172a44c4af189f12f351f21830f098d5a5288ab049033a7c916be11a0b65f0277b95f6"

RPROVIDES:${PN} += "bosh \
bosh(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libfind.so.4.0()(64bit) \
libschily.so.2.0()(64bit) \
libxtermcap.so.1.0()(64bit)"

inherit rpm

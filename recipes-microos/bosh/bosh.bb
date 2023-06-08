SUMMARY = "Multibyte-capable POSIX-conforming Bourne shell"
DESCRIPTION = "bosh is a Bourne-style POSIX command interpreter (shell), similar to dash, \
but supports multibyte input/output."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "bosh-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "b8c139c8b30384514348f6c18c326e5349546bdea3292eee5d9d040689172a44c4af189f12f351f21830f098d5a5288ab049033a7c916be11a0b65f0277b95f6"

RPROVIDES:${PN} += "bosh bosh(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libfind.so.4.0()(64bit) libfind.so.4.0(SCHILY_0.1)(64bit) libfind.so.4.0(SCHILY_0.9.1)(64bit) libschily.so.2.0()(64bit) libschily.so.2.0(SCHILY_1.0)(64bit) libschily.so.2.0(SCHILY_1.2)(64bit) libschily.so.2.0(SCHILY_1.3)(64bit) libschily.so.2.0(SCHILY_1.4)(64bit) libschily.so.2.0(SCHILY_1.5)(64bit) libschily.so.2.0(SCHILY_1.6)(64bit) libschily.so.2.0(SCHILY_1.9)(64bit) libschily.so.2.0(SCHILY_2.0)(64bit) libxtermcap.so.1.0()(64bit) libxtermcap.so.1.0(SCHILY_1.0)(64bit) libxtermcap.so.1.0(SCHILY_1.1)(64bit)"

inherit rpm

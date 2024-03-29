SUMMARY = "Uses PAM Binary Prompts to Ask Applications for Username/Password"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
pam_userpass uses PAM binary prompts to ask the application for the \
username and password."
LICENSE = "ISC"

PV = "1.0.2"

RPM_NAME = "pam_userpass-1.0.2-66.7.aarch64.rpm"
RPM_HASH = "4a0a68e00687da678396b172abd86764c105986508417b0026335789dd57b18fd42310f3dcfa428b147543ee5dcb217501294722562caac13fb27fd894f3f313"

RPROVIDES:${PN} += "pam-modules-/usr/lib64/security/pam-userpass.so \
pam-userpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
pam"

inherit rpm

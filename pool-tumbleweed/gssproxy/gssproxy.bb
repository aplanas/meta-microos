SUMMARY = "Daemon for managing gss-api requests"
DESCRIPTION = "gssproxy allows the complexity of GSS security negotiation \
to be centrallized.  It is particularly useful to keep this out \
of kernel space, so that CIPFS, NFS, AFS etc can use GSS-API without \
complexity in the kernel. \
 \
Using it also improves isolation and privilege separation, so that \
HTTP servers, for example, can use GSS-API without needing to access \
keys directly."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "gssproxy-0.8.4-2.8.aarch64.rpm"
RPM_HASH = "339ac0dcfe74a7817c3c34461f6b7f6ced24e36e5391445b03a66a0b80895af2cbaa42fd4400c04398c6c8b827016ecc2c6d8fe6bb6ef42932154a29291553e9"

RPROVIDES:${PN} += "config-gssproxy \
gssproxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libgssrpc.so.4 \
libini-config.so.5 \
libk5crypto.so.3 \
libkrb5.so.3 \
libpopt.so.0 \
libref-array.so.1 \
libselinux.so.1 \
libverto.so.1 \
systemd"

inherit rpm

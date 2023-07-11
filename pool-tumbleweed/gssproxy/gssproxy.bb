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

RPM_NAME = "gssproxy-0.8.4-2.9.aarch64.rpm"
RPM_HASH = "df56ede33e6f111a30939e80fe1d99a5f55af5deab7b89b973d8cea80217d30fb804b07608e9e616a63d829a382a7f0af49184b70caf8e103f5bfe0100fd08a4"

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

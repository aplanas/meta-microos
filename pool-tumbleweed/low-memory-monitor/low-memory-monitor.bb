SUMMARY = "Early boot daemon to monitor memory pressure and react to low memory"
DESCRIPTION = "The Low Memory Monitor is an early boot daemon that will monitor memory \
pressure information coming from the kernel, and, when memory pressure means \
that memory isn't as readily available and would cause interactivity problems, \
would: \
* send D-Bus signals to user-space applications when memory is running low, \
* if configured to do so and memory availability worsens, activate the kernel's \
  OOM killer."
LICENSE = "GPL-3.0-only"

PV = "2.1"

RPM_NAME = "low-memory-monitor-2.1-3.8.aarch64.rpm"
RPM_HASH = "0dcf69e7535eb6cf5978128f4a16955c74b97ab0a16125bd63a4ea2a47ae15843cac02db79ca5febc9a8ef4c919f7e538f4b20515df8f8628962bde97242b688"

RPROVIDES:${PN} += "low-memory-monitor"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
systemd"

inherit rpm

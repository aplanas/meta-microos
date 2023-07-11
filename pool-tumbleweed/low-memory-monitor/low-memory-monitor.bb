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

RPM_NAME = "low-memory-monitor-2.1-3.9.aarch64.rpm"
RPM_HASH = "bb39442fae3bde900ad328faeae470dfce71585c55feeb6bb560fd4d9526c7897cf3205d3f8fc099b5a366a127d49eb201b66ab144d5c5f4a4a84c92440de98f"

RPROVIDES:${PN} += "low-memory-monitor"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
systemd"

inherit rpm

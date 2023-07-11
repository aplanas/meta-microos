SUMMARY = "D-Bus service to check the availability of dual-GPU"
DESCRIPTION = "switcheroo-control is a D-Bus service to check the availability of dual-GPU."
LICENSE = "GPL-3.0-only"

PV = "2.6"

RPM_NAME = "switcheroo-control-2.6-1.5.aarch64.rpm"
RPM_HASH = "a008ed765ca0d3094901a86aae7a0836bd82389d2ad760b3b84d1bd4d5779e07c7f18bc70226074a1028d94259eaf827ec8a2139c4f59defa16948ab8f99352f"

RPROVIDES:${PN} += "switcheroo-control"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
systemd"

inherit rpm

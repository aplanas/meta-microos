SUMMARY = "Mednafen network play server"
DESCRIPTION = "Network play server for mednafen"
LICENSE = "GPL-2.0-only"

PV = "0.5.2"

RPM_NAME = "mednafen-server-0.5.2-9.6.aarch64.rpm"
RPM_HASH = "2928bc3fa9d0af516aa0759861e21a3b26e13ec1af3229ac6588437e72949f3301eb2339aecdb87dfe4a6632b1f65d14fc3e691ed77770fad80089e7a505837f"

RPROVIDES:${PN} += "config(mednafen-server) \
mednafen-server \
mednafen-server(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
group(games) \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
shadow"

inherit rpm

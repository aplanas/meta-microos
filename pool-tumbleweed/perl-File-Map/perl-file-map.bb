SUMMARY = "Memory mapping made simple and safe"
DESCRIPTION = "File::Map maps files or anonymous memory into perl variables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.71"

RPM_NAME = "perl-File-Map-0.71-1.3.aarch64.rpm"
RPM_HASH = "74c40b2f7d4688afa4db2b28ba36c0a3ee62eebda8c6a2d26d18eab376c7d5f9b44b46abc3d95c40e20c72b69fc5d9e2ab7b26d564db74072e14d4e97a324e52"

RPROVIDES:${PN} += "perl-File--Map \
perl-File-Map"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Sub--Exporter--Progressive"

inherit rpm

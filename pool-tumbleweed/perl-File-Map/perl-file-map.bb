SUMMARY = "Memory mapping made simple and safe"
DESCRIPTION = "File::Map maps files or anonymous memory into perl variables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.71"

RPM_NAME = "perl-File-Map-0.71-1.1.aarch64.rpm"
RPM_HASH = "81fe7ef72921664d9151ea207db8b4f84ad65ccf8ccc845286fa702ab57c19f831c53fc172bf6315c2d7a5d05ae206043574683d9be76498bcebc1de78c01ffd"

RPROVIDES:${PN} += "perl-File--Map \
perl-File-Map"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0 \
perl-Sub--Exporter--Progressive"

inherit rpm

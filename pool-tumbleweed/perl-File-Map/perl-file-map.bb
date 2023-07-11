SUMMARY = "Memory mapping made simple and safe"
DESCRIPTION = "File::Map maps files or anonymous memory into perl variables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.71"

RPM_NAME = "perl-File-Map-0.71-1.2.aarch64.rpm"
RPM_HASH = "3f91acc616a2c1a46f3c904192d1a3e8221202488891c7d7f35349a57788ecd4165e418ec7cc8b1f526c464f01c9379904c698167c9c18b6d4478cf175e39b4d"

RPROVIDES:${PN} += "perl-File--Map \
perl-File-Map"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Sub--Exporter--Progressive"

inherit rpm

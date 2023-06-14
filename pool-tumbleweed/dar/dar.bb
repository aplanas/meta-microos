SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar (Disk Archive) is a hardware-independent backup solution. Dar uses \
catalogs (unlike tar),which it makes it possible to extract a single \
file without having to read the entire archive. It is also possible to \
create incremental backups. Dar archives can also be created or used \
with the libdar library (for example, with KDar, a KDE application). \
This package contains the command line tools and documentation."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.8"

RPM_NAME = "dar-2.7.8-1.4.aarch64.rpm"
RPM_HASH = "943e9bf0f5ed18b91e3c799a3c5a6b3b8140a2b487c0aa1582d1e237f0e4cd210c07b601fbc9f16ea01aa902a2cdcd96dc8e0144afb8c45776d7a0540bb435a6"

RPROVIDES:${PN} += "dar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libdar64.so.6000 \
libgcc-s.so.1 \
libgpgme.so.11 \
libstdc++.so.6"

inherit rpm

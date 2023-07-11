SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar (Disk Archive) is a hardware-independent backup solution. Dar uses \
catalogs (unlike tar),which it makes it possible to extract a single \
file without having to read the entire archive. It is also possible to \
create incremental backups. Dar archives can also be created or used \
with the libdar library (for example, with KDar, a KDE application). \
This package contains the command line tools and documentation."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.9"

RPM_NAME = "dar-2.7.9-1.1.aarch64.rpm"
RPM_HASH = "239d702f28d603b2895c896a83407e4143d3301f0573f08c6340052b0e8b8ef63d181942b41c335c61967bee6fe5c11ebd975b1090a72711fdcd9a528b87025a"

RPROVIDES:${PN} += "dar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libdar64.so.6000 \
libgcc-s.so.1 \
libgpgme.so.11 \
libstdc++.so.6"

inherit rpm

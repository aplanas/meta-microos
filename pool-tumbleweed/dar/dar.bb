SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar (Disk Archive) is a hardware-independent backup solution. Dar uses \
catalogs (unlike tar),which it makes it possible to extract a single \
file without having to read the entire archive. It is also possible to \
create incremental backups. Dar archives can also be created or used \
with the libdar library (for example, with KDar, a KDE application). \
This package contains the command line tools and documentation."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.10"

RPM_NAME = "dar-2.7.10-1.1.aarch64.rpm"
RPM_HASH = "3db6b02e39218ab6136353ebaf8282c6c7c3ca1aeda10d8a1bcda745dd1d65ee4d8240e57f8d0e2c9757eae0a42ae3e2940e654113b838c3e27bb488a3ac12a9"

RPROVIDES:${PN} += "dar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libdar64.so.6000 \
libgcc-s.so.1 \
libgpgme.so.11 \
libstdc++.so.6"

inherit rpm

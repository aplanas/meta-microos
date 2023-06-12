SUMMARY = "Slurm SQL support"
DESCRIPTION = "Contains interfaces to MySQL for use by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-sql-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "f62653546ed224f47dc2439ce49bdf90be30683ec34cadbd221dcfeaa794cf1aefe85254f57686dc155ebebad66b7408b212c4c51746b8233aef10d5a6155200"

RPROVIDES:${PN} += "slurm-sql \
slurm-sql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm

SUMMARY = "Slurm SQL support"
DESCRIPTION = "Contains interfaces to MySQL for use by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-sql-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "9316511c2866b296ebb9847b81ecacbcdd56f8351e43355c60ddee1d1f9681071469dc6751ec768011429a694bf2766eb92c57910fb514f06d6dab79b51c19fc"

RPROVIDES:${PN} += "slurm-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm

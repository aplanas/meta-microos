SUMMARY = "Slurm SQL support"
DESCRIPTION = "Contains interfaces to MySQL for use by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-sql-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "4cb968f89e6b1e9b49d048191514a4b2a7cfe9559a6c115b6ba36ac097e17bf9c82058c58d8a7e8de4c4dfcc645f7b529da3b19cf726e00bacf85526e31e6b57"

RPROVIDES:${PN} += "slurm-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm

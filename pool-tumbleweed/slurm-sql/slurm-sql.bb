SUMMARY = "Slurm SQL support"
DESCRIPTION = "Contains interfaces to MySQL for use by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-sql-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "0783b09810cb552e7bc6e2eeff2cc85197144d0c3dfe7620bbcbb8d898ab4c31c1dd13f48edd4021440c6fd15165d8b6715d887fa698615058334625df45a708"

RPROVIDES:${PN} += "slurm-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm

SUMMARY = "Set up SLURM Documentation Server"
DESCRIPTION = "Set up HTTP server for SLURM configuration."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-webdoc-23.02.4-2.1.noarch.rpm"
RPM_HASH = "95900cfa4705939da524f99f641b7d0eb709b463cb3adf93574410a3fe5d08c0c01f10c16e8228575731e6beb8cd2c31b9f6cb38613d43529fe7f6b7607a3a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-slurm-webdoc \
slurm-webdoc"

RDEPENDS:${PN} += "apache2 \
slurm-doc"

inherit rpm

SUMMARY = "Set up SLURM Documentation Server"
DESCRIPTION = "Set up HTTP server for SLURM configuration."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-webdoc-23.02.2-1.3.noarch.rpm"
RPM_HASH = "c315d6c994e1356cb34f6a8742da7514242855f5f3cff6d20aee9279ff3ce8dd95e933c4da305c1a5c8ee087a27469d77f67d903986a07c863b508b0e2d8a4f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-slurm-webdoc \
slurm-webdoc"

RDEPENDS:${PN} += "apache2 \
slurm-doc"

inherit rpm

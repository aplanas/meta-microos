SUMMARY = "Set up SLURM Documentation Server"
DESCRIPTION = "Set up HTTP server for SLURM configuration."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-webdoc-23.02.2-1.1.noarch.rpm"
RPM_HASH = "f59d9a213cdf5418bfbf231fc6eeb6dd820a413991f4d9f2d43ac80ddc4c6e45b3dcade83463962e1e81f808cd41baa776aec0dbb0fb4d773869bce5c6de5ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-slurm-webdoc \
slurm-webdoc"

RDEPENDS:${PN} += "apache2 \
slurm-doc"

inherit rpm

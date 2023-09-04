SUMMARY = "Set up SLURM Documentation Server"
DESCRIPTION = "Set up HTTP server for SLURM configuration."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-webdoc-23.02.2-1.4.noarch.rpm"
RPM_HASH = "6d8fec0964781dd86727f0486a49cdd02f6ecef87f4ed8279ae882472bb75dbea09faa93048e6495a7d6c1d6377779a35db5eb86343858489fdb7209ffbcccde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-slurm-webdoc \
slurm-webdoc"

RDEPENDS:${PN} += "apache2 \
slurm-doc"

inherit rpm

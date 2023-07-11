SUMMARY = "Documentation for SLURM"
DESCRIPTION = "Documentation (HTML) for the SLURM cluster managment software."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-doc-23.02.2-1.3.noarch.rpm"
RPM_HASH = "a114ec2ae2c8fb0ed79b3808298994e2991ed19b5e4ea19171f0d3571c53d338906e70a818b325f0f31dac9cb175ea568c6786bd339476c5dbe2afb26c53c560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-doc"

RDEPENDS:${PN} += ""

inherit rpm

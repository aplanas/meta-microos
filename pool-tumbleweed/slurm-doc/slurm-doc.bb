SUMMARY = "Documentation for SLURM"
DESCRIPTION = "Documentation (HTML) for the SLURM cluster managment software."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-doc-23.02.2-1.1.noarch.rpm"
RPM_HASH = "f9a46ecf7d379ffda9c15eecf692d1354454b739566ecfcd742bea7dbbec0c10ac401935fd8ad89267c2eca09b2c41b213539b598b547b0b01dff8f558814057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-doc"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for SLURM"
DESCRIPTION = "Documentation (HTML) for the SLURM cluster managment software."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-doc-23.02.4-2.1.noarch.rpm"
RPM_HASH = "b0a044e8d591249d5076fb331ea77c2b375adb22df4df8f3312ea5b5ee8bc63a3681c2ac6a7998c7deaf0c391f416ff01248baae0475c7180ff736c343b1f809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-doc"

RDEPENDS:${PN} += ""

inherit rpm

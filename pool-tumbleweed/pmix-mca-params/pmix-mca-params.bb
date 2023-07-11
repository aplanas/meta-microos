SUMMARY = "Settings for the Module Component Architecure"
DESCRIPTION = "PMIX is part of the Module Component Architecure and needs so to have its \
parameters configured."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-mca-params-3.2.3-10.2.noarch.rpm"
RPM_HASH = "5f5db69b94e6ee8cf64a91cbff3ee3f4a40233a9a0856b50afc1336649764d505f34a8692d69bd7c76a980641702bb76378ecd20edfcdfb8f1f035d9b51af28f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pmix-mca-params \
pmix-mca-params \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm

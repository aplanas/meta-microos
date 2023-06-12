SUMMARY = "Bash completion for GDAL"
DESCRIPTION = "bash command line completion support for GDAL"
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-bash-completion-3.6.3-2.1.noarch.rpm"
RPM_HASH = "4dd1615b8d211daa4006a3a3d472b49fd76a727373a02e8f0d1962c2c4a98a14f721eac0014c548534183598d4b697d7f6c5db584021da8238b7261ef242e23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdal-bash-completion"
RDEPENDS:${PN} += "bash-completion gdal"

inherit rpm

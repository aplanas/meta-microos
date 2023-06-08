SUMMARY = "Bash completion for GDAL"
DESCRIPTION = "bash command line completion support for GDAL"
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-bash-completion-3.6.3-1.4.noarch.rpm"
RPM_HASH = "f65031c257ce24e61ce1a829b87662207f2d72ddb45eb0ef54887c2a75714b2b773bad71abdb626a4fbee120ad363ced5e40607616d49cf63fe35f3baba51c01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdal-bash-completion"
RDEPENDS:${PN} += "bash-completion gdal"

inherit rpm

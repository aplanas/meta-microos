SUMMARY = "Bash completion for GDAL"
DESCRIPTION = "bash command line completion support for GDAL"
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-bash-completion-3.6.3-2.6.noarch.rpm"
RPM_HASH = "0b0852a30dad33c2d4ed4a2c886aadebb7a195ec1d3a894f13607a2e753eab3df7aa7fe3b86536b20914e3f95b62e7185a41b8ac25dfb59736127d2f1e53cda5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdal-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gdal"

inherit rpm

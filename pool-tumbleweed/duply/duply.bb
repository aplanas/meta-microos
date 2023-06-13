SUMMARY = "A frontend for the 'duplicity' backup program"
DESCRIPTION = "A shell front end to duplicity that simplifies the usage by managing \
settings for backup jobs in profiles. It supports executing multiple \
commands in a batch mode to enable single line cron entries and executes \
pre/post backup scripts."
LICENSE = "GPL-2.0-only"

PV = "2.4.2"

RPM_NAME = "duply-2.4.2-1.1.noarch.rpm"
RPM_HASH = "6359b357acf9256a180397286cb2dc27d2f48c52c9fc7aa7b233858880e40cde9cac8abb9ed1c28e89f7e551ae2f81ad2ed0ff1d90de1cf9088c1d4831bc1163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "duply"

RDEPENDS:${PN} += "/bin/bash \
duplicity"

inherit rpm

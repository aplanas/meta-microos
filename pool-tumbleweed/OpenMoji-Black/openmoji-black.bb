SUMMARY = "Black only color emoji"
DESCRIPTION = "Black color only variation of Openmoji glyphs."
LICENSE = "CC-BY-SA-4.0"

PV = "13.1.0+git.1605265744.4a80b536e"

RPM_NAME = "OpenMoji-Black-13.1.0+git.1605265744.4a80b536e-1.6.noarch.rpm"
RPM_HASH = "448b7389b79998b03c1039495c8e17cef6a8bc28a3e12a854aef41b41c8d2e2e09b63871936acb99dbc4b6dad57e49808c673f0b9712a103b9e6770ad7d63b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenMoji-Black"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm

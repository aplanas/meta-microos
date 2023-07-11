SUMMARY = "Empty package to ensure rebuilding cpupower in OBS"
DESCRIPTION = "This is empty package that ensures cpupower is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "cpupower-rebuild-6.3.9-4.15.aarch64.rpm"
RPM_HASH = "bef2c979df6ebc3e40371f48f268b6fed65e1340e5dec4de073059171ad29dc899a4b953573c2f2fbf7949d1fd1458f5e2c465a343264672a539dadd76e02847"

RPROVIDES:${PN} += "cpupower-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm

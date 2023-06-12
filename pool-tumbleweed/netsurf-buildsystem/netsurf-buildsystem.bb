SUMMARY = "Makefiles shared by NetSurf projects"
DESCRIPTION = "netsurf-buildsystem contains makefiles shared by NetSurf projects."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "netsurf-buildsystem-1.9-1.8.noarch.rpm"
RPM_HASH = "f8cb58a0187de14bc349d4a43f2a89b5dbfdfaa86d94829b2b55d82bcc9cf8f3aa8a58fd30275b87e5c426570f0c877a0df0866cf8fc9fbadf9fe1e1415857cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netsurf-buildsystem"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm

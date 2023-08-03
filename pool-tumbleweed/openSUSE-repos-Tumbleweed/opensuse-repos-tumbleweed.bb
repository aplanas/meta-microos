SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20230731.a018a46"

RPM_NAME = "openSUSE-repos-Tumbleweed-20230731.a018a46-1.1.aarch64.rpm"
RPM_HASH = "d93082cfc645016d950248b9610e9c9005a322c6c28cfcce6c59bf5c020c1c50283550915736ba878af9bbc1e8a5950c670d3f66506fcdbaff43e7b178a06403"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-Tumbleweed"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm

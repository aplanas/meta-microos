SUMMARY = "Headers and development files"
DESCRIPTION = "genders headers and libraries files needed for development"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-devel-1.28.1-2.6.aarch64.rpm"
RPM_HASH = "445f1db08f90cc85dc4adf51f81ce22911449d83a19d23b7af19cc76c5af6b8b08ac1b24684329ce997e84825b8301fc3711bb97d3417c89b253cb1e0270117a"

RPROVIDES:${PN} += "genders-devel"

RDEPENDS:${PN} += "genders"

inherit rpm

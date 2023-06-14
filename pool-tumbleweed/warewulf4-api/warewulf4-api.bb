SUMMARY = "Contains the service for the warewulf rest API"
DESCRIPTION = "Containts the binaries for the access of warewulf through a rest API and from the commandline from an external host."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-api-4.4.0-6.4.aarch64.rpm"
RPM_HASH = "40bb81371ffbe8a468fcd34c44a9c87222cdbc6d012ea81fdfb9f87f53f5ac582b705fecf50fe83515e0243c7871f1466415727d229916ab97eb03f352ff4ec2"

RPROVIDES:${PN} += "config-warewulf4-api \
warewulf4-api"

RDEPENDS:${PN} += "libc.so.6 \
libgpgme.so.11 \
warewulf4"

inherit rpm

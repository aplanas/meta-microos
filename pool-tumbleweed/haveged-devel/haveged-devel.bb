SUMMARY = "Haveged development files"
DESCRIPTION = "Headers and for the haveged library \
 \
This package contains the haveged implementation of the HAVEGE \
algorithm and supporting features."
LICENSE = "GPL-3.0-only"

PV = "1.9.18"

RPM_NAME = "haveged-devel-1.9.18-2.4.aarch64.rpm"
RPM_HASH = "7234ed4588214cd025ebf706f79f56c50ea429203e232c29b9ff3fec9f8c70863acaf1ef55c2541a3f02be3baf579144c7de8d366e32bc5c733b4d562ac718a2"

RPROVIDES:${PN} += "haveged-devel"

RDEPENDS:${PN} += "libhavege2"

inherit rpm

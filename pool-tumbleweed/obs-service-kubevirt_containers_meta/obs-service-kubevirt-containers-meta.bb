SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "obs-service-kubevirt_containers_meta-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "64542724258fce659bb6d11aa22b71bfdfac5c5b452c8d008bd82517286828d59fbd73855352a33947630d37b2b072c6e93094ff628ab273ed802d85205ce95c"

RPROVIDES:${PN} += "obs-service-kubevirt-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

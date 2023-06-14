SUMMARY = "Libraries and header files for ChaSen developers"
DESCRIPTION = "Libraries and header files for ChaSen developers."
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "chasen-devel-2.4.5-2.11.aarch64.rpm"
RPM_HASH = "b9a2694b04e892f4bbeeee768dda93e3e12330d84e89fe2bcf6909412f1fe6374dba14ccef4fbed222c899ca08d292fe2773cc9435c0e907fdc3d0a6561cc6dd"

RPROVIDES:${PN} += "chasen-devel"

RDEPENDS:${PN} += "/bin/sh \
chasen"

inherit rpm

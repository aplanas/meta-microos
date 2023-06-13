SUMMARY = "Documentation for OpenColorIO"
DESCRIPTION = "This package contains documentation for OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-doc-2.1.2-3.1.noarch.rpm"
RPM_HASH = "caf8d5543840916ff25ec2f44b35d2a56b30c42e9a9aba149288849622a7922fbc600a65f7c750f681c7a205a5a27349c7314c4cd3d7d97cd4f454320d0dc04c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenColorIO-doc"

RDEPENDS:${PN} += ""

inherit rpm

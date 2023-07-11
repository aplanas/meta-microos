SUMMARY = "Documentation for OpenStack sushy"
DESCRIPTION = "Sushy is a Python library to communicate with `Redfish` based systems. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "4.4.2"

RPM_NAME = "python-sushy-doc-4.4.2-1.3.noarch.rpm"
RPM_HASH = "2f8f947eacd2a60129d573ebcfa5406a51958953f97dd04108641f66e3eb3c3b57f96e35c7e0355f159b1a0298461ef29a39f4c7c146ff54797c511515d01cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sushy-doc"

RDEPENDS:${PN} += ""

inherit rpm

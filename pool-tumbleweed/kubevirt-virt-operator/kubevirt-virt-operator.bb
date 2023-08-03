SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-operator-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "8f9596ab61e8769a24784c6ba909f93451afc9abf091df5bb9f463ab36b2fb7470c8aef3894c802f8fc60ae05b83b1130ed1c3cb71b8f02c635bcad02ce32b02"

RPROVIDES:${PN} += "kubevirt-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

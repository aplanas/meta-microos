SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportproxy-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "d568e13144056eec9afea7aa6199b768a21a95fc7625774e86aa296f14c47072313f54aa3ad9d6e9b02e5c4289017b5b32e5bda08e675eb23066797dbcefa58e"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

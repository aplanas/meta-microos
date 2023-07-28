SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportproxy-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "83d84e246c979aaf0014c0f186302667cc10f1dc4e09d57617a2f7c7767252f135970d3e59d59b04c5aa3322b272282ec0dce24dcf802f4a0be2ccc0269593c7"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

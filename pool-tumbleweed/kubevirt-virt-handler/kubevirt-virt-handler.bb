SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-handler-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "173744ae8aab253b09dc346403853e0af7c55e54044b36dd1985824952c273dbbb6bd7b750d9f964844640147dc68ef11db1ccf9afb48d38e874979fea2ed031"

RPROVIDES:${PN} += "kubevirt-virt-handler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-api-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "235c209dd84d86df4af2f92adeff7aa1388923111cfdc657a6dc1106954ce931a004ac5e5c16b755d72773965574a262dba56adb38a99b50d7877de460a6f443"

RPROVIDES:${PN} += "kubevirt-virt-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

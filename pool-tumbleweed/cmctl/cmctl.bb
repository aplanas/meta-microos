SUMMARY = "CLI tool that can help you to manage cert-manager resources inside your cluster"
DESCRIPTION = "cmctl is a CLI tool that can help you to manage cert-manager resources inside your cluster. \
While also available as a kubectl plugin, it is recommended to use as a stand alone binary as this allows the use of command auto-completion."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "cmctl-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "85117b178bef9df7402898eb43b1aea52482465b151da3ac7fe888d6f15762cf0d7ca70f376f6e744b2f90c0162fc20cf3093ddf921d8ed199b464bd00653ae5"

RPROVIDES:${PN} += "cmctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

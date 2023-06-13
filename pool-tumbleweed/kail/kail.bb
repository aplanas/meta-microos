SUMMARY = "Kubernetes log viewer"
DESCRIPTION = "Kubernetes tail: streams logs from all containers of all matched pods. \
Match pods by service, replicaset, deployment, and others. Adjusts to a \
changing cluster - pods are added and removed from logging as they fall \
in or out of the selection."
LICENSE = "MIT"

PV = "0.16.1"

RPM_NAME = "kail-0.16.1-1.4.aarch64.rpm"
RPM_HASH = "806c695dd8ca2cb4bafe2a55df65c0e90eb5d133504737afc6e19d5ae0d08244d93581695ada2525fcb85470d3a3be5c1522dcccd1003460f2416f7f5ff9f589"

RPROVIDES:${PN} += "kail \
kail(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

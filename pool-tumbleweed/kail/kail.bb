SUMMARY = "Kubernetes log viewer"
DESCRIPTION = "Kubernetes tail: streams logs from all containers of all matched pods. \
Match pods by service, replicaset, deployment, and others. Adjusts to a \
changing cluster - pods are added and removed from logging as they fall \
in or out of the selection."
LICENSE = "MIT"

PV = "0.16.1"

RPM_NAME = "kail-0.16.1-1.5.aarch64.rpm"
RPM_HASH = "8ab4bc5bad1e3005df509968545b148a6dbc6760c799b7f2df255659a9911e7072d3466bb98f40a2f7884ebd6657ebafff1fdd4c03fa669aa00619ec50860a23"

RPROVIDES:${PN} += "kail"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

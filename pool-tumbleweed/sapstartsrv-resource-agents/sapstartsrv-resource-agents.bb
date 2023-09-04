SUMMARY = "Resource agent for SAP instance specific sapstartsrv service"
DESCRIPTION = "This is a resource agent for the instance specific SAP start framework. \
It controls the instance specific sapstartsrv process which provides the \
API to start, stop and check an SAP instance. \
 \
Authors: \
-------- \
    Fabian Herschel \
    Lars Pinne \
    Xabier Arbulu"
LICENSE = "GPL-2.0"

PV = "0.9.3+git.1691394819.48fa0c6"

RPM_NAME = "sapstartsrv-resource-agents-0.9.3+git.1691394819.48fa0c6-1.1.noarch.rpm"
RPM_HASH = "631b2cabbb1f5f777ad6f4868219e2d470be40a08e4022ea4766650ab0080d029e7c65fe1843ff7502615466bd6ca047c2b5dc5a5dbc0384969a189fc7a4c53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sapstartsrv-resource-agents"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
pacemaker \
python3 \
python3-psutil \
resource-agents"

inherit rpm

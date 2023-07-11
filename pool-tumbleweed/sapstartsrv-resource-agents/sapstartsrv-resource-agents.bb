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

PV = "0.9.2+git.1684336720.d2ebd49"

RPM_NAME = "sapstartsrv-resource-agents-0.9.2+git.1684336720.d2ebd49-1.2.noarch.rpm"
RPM_HASH = "49eec7f537535034bf106851f8d4d05467c734f652b963f01a1c416eb38799364b29e61a9690c05873a52cdb5e5bd51b3324f07ec8b8c514057bcbb5cbde7f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sapstartsrv-resource-agents"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
pacemaker \
python3 \
python3-psutil \
resource-agents"

inherit rpm

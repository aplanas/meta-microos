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

RPM_NAME = "sapstartsrv-resource-agents-0.9.2+git.1684336720.d2ebd49-1.1.noarch.rpm"
RPM_HASH = "458c66788511751a0a3258035a2a3a056e580671f4afe8da2e13c80f23f89206b4594fd527fa4a236c7cd6f923c973f0348e03ff59087e5ac25f97dd5b5fa5d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sapstartsrv-resource-agents"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
pacemaker \
python3 \
python3-psutil \
resource-agents"

inherit rpm

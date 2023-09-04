SUMMARY = "Examples from the BPF Compiler Collection"
DESCRIPTION = "Python and C examples from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-examples-0.26.0-2.12.noarch.rpm"
RPM_HASH = "3098210d945966e972983c59bf43ff74eb91f2fc0ae97975a77b547de1b2790858e414eaf6d3701ecec0be3c66576fc369324e93cc98c3d762b43d79310b5487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python3-bcc \
python3-future"

inherit rpm

SUMMARY = "Examples from the BPF Compiler Collection"
DESCRIPTION = "Python and C examples from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-examples-0.26.0-2.10.noarch.rpm"
RPM_HASH = "f16a59041755d8118a488a69d472e7469ca1b7f6f57799991a68122deba02043c0258278b8a18165d80c865a3e011a3ac22bc17d0b9b45fbe2204208f9908454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python3-bcc \
python3-future"

inherit rpm

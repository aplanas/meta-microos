SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python39-javapackages-6.1.0-3.2.noarch.rpm"
RPM_HASH = "897823a273884b0aad62fa6fb79877ddddafbaec0f0d17cd08972ffb322551273213877b40d27c6efab879a24fe404b28c71804c14b6b53866de1f6f8d274804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-javapackages \
python39-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-xml"

inherit rpm

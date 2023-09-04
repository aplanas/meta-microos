SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "python39-javapackages-6.1.0-4.1.noarch.rpm"
RPM_HASH = "290d00dd410f0e27d6435cfdc16606a866e43c3a84d26fad39aad50088dd9b174a3883c07cf75703b0ded07cd58f4e1f2ffe3c2e37fcbae8304ce192c4bde816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-javapackages \
python39-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-xml"

inherit rpm

SUMMARY = "Read & Write Java Properties Files"
DESCRIPTION = "Read & write Java .properties files."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python39-javaproperties-0.8.1-1.3.noarch.rpm"
RPM_HASH = "6c7f768bab76ff95b6c9f4b83ac5a48848a1b95040b926e1e1c24a693b3091e338187ee825b912f1987ebbbb56d9ba26a14e30cbb8f3254c09e3240ac1ac6498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-javaproperties \
python39-javaproperties \
python3dist-javaproperties"

RDEPENDS:${PN} += "python-abi"

inherit rpm

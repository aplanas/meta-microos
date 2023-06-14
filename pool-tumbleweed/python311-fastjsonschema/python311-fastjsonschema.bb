SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.17.1"

RPM_NAME = "python311-fastjsonschema-2.17.1-1.1.noarch.rpm"
RPM_HASH = "ce4d518829af8f7588e31f67797c9a8c6beb30f1b7bbfcf3d937c277adb9c3001914051455e5995cee2c10e195aa0e25ee1ae6523c3f7c56d6d060a11b0e41c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fastjsonschema \
python311-fastjsonschema \
python3dist-fastjsonschema"

RDEPENDS:${PN} += "python-abi"

inherit rpm

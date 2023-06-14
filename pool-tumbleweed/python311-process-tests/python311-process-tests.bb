SUMMARY = "Tools for testing processes"
DESCRIPTION = "Testcase classes and assertions for testing processes."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python311-process-tests-2.1.2-2.1.noarch.rpm"
RPM_HASH = "ef55f203d4388dbbdc2f92e72e6da3ead1d625e24525b802bb0cf3d4cc67669b2eed7a7207a7cf992e93e1a3a9b42dcdde6d6ea51fa7053b20c426e7aea942e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-process-tests \
python311-process-tests \
python3dist-process-tests"

RDEPENDS:${PN} += "python-abi"

inherit rpm

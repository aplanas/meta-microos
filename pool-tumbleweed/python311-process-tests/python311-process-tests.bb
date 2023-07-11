SUMMARY = "Tools for testing processes"
DESCRIPTION = "Testcase classes and assertions for testing processes."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python311-process-tests-2.1.2-2.2.noarch.rpm"
RPM_HASH = "e540257cd983255b8dc29688d8e6fa33c8fb0320b014ea06baf3dd546626c3fcdc7a6b7a6891e327e5094e95dcf42e7ae2a36d2f46b981fb7077673ac39d7d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-process-tests \
python3.11dist-process-tests \
python311-process-tests \
python3dist-process-tests"

RDEPENDS:${PN} += "python-abi"

inherit rpm

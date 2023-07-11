SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python39-mergedeep-1.3.4-2.9.noarch.rpm"
RPM_HASH = "bc41413a34153740c8c4fe83b8b650d55e6bd4623565ca879bacbe967e659696166de9928c34648e8a77454c365c1db46c636b9a0611f9f9be2b7174f6c0df0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mergedeep \
python39-mergedeep \
python3dist-mergedeep"

RDEPENDS:${PN} += "python-abi"

inherit rpm

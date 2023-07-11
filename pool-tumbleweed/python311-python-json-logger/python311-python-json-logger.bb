SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "2.0.7"

RPM_NAME = "python311-python-json-logger-2.0.7-1.2.noarch.rpm"
RPM_HASH = "11c789b95c3fc48ede86589e53d6dfd448a2644d18d866baa87e64c7ed5ae07156d36e8bf39d2099ed5ea6375425b38726d223c1c66db05ac7c2115904c77b08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-json-logger \
python3.11dist-python-json-logger \
python311-python-json-logger \
python3dist-python-json-logger"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm

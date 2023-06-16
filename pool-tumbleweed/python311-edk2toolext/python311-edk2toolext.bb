SUMMARY = "Tianocore Edk2 PyTool Extensions"
DESCRIPTION = "Extensions to the edk2 build system allowing for a more robust and plugin based build system and tool execution environment"
LICENSE = "BSD-2-Clause-Patent"

PV = "0.14.0"

RPM_NAME = "python311-edk2toolext-0.14.0-1.4.noarch.rpm"
RPM_HASH = "0c1621c7b660ac9d87a079b62bbb42d3829867d85688de4e2f8fba1c12d491d5861c7ee952292929938ee72bfa05b4c012ae634c80a0ff1363f9c3ddbc88c34e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-edk2-pytool-extensions \
python311-edk2toolext \
python3dist-edk2-pytool-extensions"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-edk2toollib \
python311-pefile \
python311-pyOpenSSL \
update-alternatives"

inherit rpm

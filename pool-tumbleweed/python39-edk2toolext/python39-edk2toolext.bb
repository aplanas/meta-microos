SUMMARY = "Tianocore Edk2 PyTool Extensions"
DESCRIPTION = "Extensions to the edk2 build system allowing for a more robust and plugin based build system and tool execution environment"
LICENSE = "BSD-2-Clause-Patent"

PV = "0.14.0"

RPM_NAME = "python39-edk2toolext-0.14.0-1.6.noarch.rpm"
RPM_HASH = "1c7b1b597de9924e48970c62f265dcffc241af8976634950e4ae8a5609444fcf74f0026ba90efef0f290b33ffb77213ea72bbf80ef36770fa5041c8367c73e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-edk2-pytool-extensions \
python39-edk2toolext \
python3dist-edk2-pytool-extensions"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-edk2toollib \
python39-pefile \
python39-pyOpenSSL \
update-alternatives"

inherit rpm

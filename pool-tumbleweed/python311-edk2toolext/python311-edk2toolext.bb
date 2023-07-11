SUMMARY = "Tianocore Edk2 PyTool Extensions"
DESCRIPTION = "Extensions to the edk2 build system allowing for a more robust and plugin based build system and tool execution environment"
LICENSE = "BSD-2-Clause-Patent"

PV = "0.14.0"

RPM_NAME = "python311-edk2toolext-0.14.0-1.6.noarch.rpm"
RPM_HASH = "8e6e4e0046b08e12123bc35e8765c0317ec6e83999f82cb92d9d5030d97053a637771365881c6a4063197b670ffd12eb50a89aa920c9ade3e926bc5154cafb53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-edk2toolext \
python3.11dist-edk2-pytool-extensions \
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

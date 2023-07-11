SUMMARY = "Tianocore Edk2 PyTool Extensions"
DESCRIPTION = "Extensions to the edk2 build system allowing for a more robust and plugin based build system and tool execution environment"
LICENSE = "BSD-2-Clause-Patent"

PV = "0.14.0"

RPM_NAME = "python310-edk2toolext-0.14.0-1.6.noarch.rpm"
RPM_HASH = "629354fc14d487ec7f00c8449a5917d11a6dd24428416684a17dd2bc8ccf45931f1397d97beb06ef794bb6f6bb7fc9d2aae9367c04fcf725368b81e42eb3a4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-edk2-pytool-extensions \
python310-edk2toolext \
python3dist-edk2-pytool-extensions"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-edk2toollib \
python310-pefile \
python310-pyOpenSSL \
update-alternatives"

inherit rpm

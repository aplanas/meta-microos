SUMMARY = "Tianocore Edk2 PyTool Extensions"
DESCRIPTION = "Extensions to the edk2 build system allowing for a more robust and plugin based build system and tool execution environment"
LICENSE = "BSD-2-Clause-Patent"

PV = "0.14.0"

RPM_NAME = "python39-edk2toolext-0.14.0-1.4.noarch.rpm"
RPM_HASH = "a85e457596c3ed0a1388607f3c10f965c55e9ff642e6145f44151f6e0bfe8ff386c0dc20e9b423ac58da09e747ae5aecde66f092032368a6043b9dbad81e4108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(edk2-pytool-extensions) \
python39-edk2toolext \
python3dist(edk2-pytool-extensions)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-edk2toollib \
python39-pefile \
python39-pyOpenSSL \
update-alternatives"

inherit rpm

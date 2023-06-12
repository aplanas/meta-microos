SUMMARY = "Tianocore Edk2 PyTool Extensions"
DESCRIPTION = "Extensions to the edk2 build system allowing for a more robust and plugin based build system and tool execution environment"
LICENSE = "BSD-2-Clause-Patent"

PV = "0.14.0"

RPM_NAME = "python310-edk2toolext-0.14.0-1.4.noarch.rpm"
RPM_HASH = "542346b09391749e93e27e6f6de1dc6a61f8c8f370e2f5e1d3d23c5ac21bf9b893655d1792b145df2e450c44a83107d288141e9c54570691e0ce453e28b4a412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-edk2toolext \
python3.10dist(edk2-pytool-extensions) \
python310-edk2toolext \
python3dist(edk2-pytool-extensions)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-edk2toollib \
python310-pefile \
python310-pyOpenSSL \
update-alternatives"

inherit rpm

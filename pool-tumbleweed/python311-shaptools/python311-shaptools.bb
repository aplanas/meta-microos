SUMMARY = "Python tools to interact with SAP HANA utilities"
DESCRIPTION = "API to expose SAP HANA functionalities"
LICENSE = "Apache-2.0"

PV = "0.3.13+git.1673855974.f208fad"

RPM_NAME = "python311-shaptools-0.3.13+git.1673855974.f208fad-1.6.noarch.rpm"
RPM_HASH = "a20a8b5a6c9aa1d17e8c8f6477188d3fb0250ba1beaa06c0e3123dc93c5842e0f21e05067f4f41e2243f65ac5ab21e561e9072cb18dc725667058fd2a108fa91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shaptools \
python3.11dist-shaptools \
python311-shaptools \
python3dist-shaptools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

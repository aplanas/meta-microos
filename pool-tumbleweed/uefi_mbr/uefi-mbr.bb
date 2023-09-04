SUMMARY = "MBR loader that just prints a message."
DESCRIPTION = "MBR loader that just prints a message for use in UEFI only \
appliances"
LICENSE = "BSD-3-Clause"

PV = "0+git20221129.53aad69"

RPM_NAME = "uefi_mbr-0+git20221129.53aad69-1.1.aarch64.rpm"
RPM_HASH = "9f229e2386c91e0630cf3aac8a9b0687bba10cc2ee5898daaf7531f31ab41a81ff524cb4590703992716c3ef5d7741b4570fa19df5360d8682fbe91eba198a1a"

RPROVIDES:${PN} += "uefi-mbr"

RDEPENDS:${PN} += ""

inherit rpm

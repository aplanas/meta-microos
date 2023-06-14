SUMMARY = "Commons Transaction"
DESCRIPTION = "Commons Transaction aims at providing lightweight, standardized, well \
tested and efficient implementations of utility classes commonly used \
in transactional Java programming. Initially there are implementations \
for multi level locks, transactional collections and transactional file \
access. There may be additional implementations when the common need \
for them becomes obvious. However, the complete component shall remain \
compatible to JDK1.2 and should have minimal dependencies."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "jakarta-commons-transaction-1.1-28.6.noarch.rpm"
RPM_HASH = "037f7402ed8f607cb8fd5bf1f48818ecf799e630a970fe6c536c3cce78bf83261dc32d47936c5ca002608c8eadf5a68caa6f8270cbed5e2f76d8c0bc31452555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-transaction"

RDEPENDS:${PN} += "geronimo-jta-1-1-api \
jakarta-commons-codec \
reload4j \
xerces-j2 \
xml-commons-apis"

inherit rpm

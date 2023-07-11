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

RPM_NAME = "jakarta-commons-transaction-1.1-28.7.noarch.rpm"
RPM_HASH = "736cc08fd12639dad674c36d7de1b363085b0380354af5ad29521cb4bc275d51d46698a44c9b4621e71fbfa55227d14416dd642d1e1358204d7842d4c5b420df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-transaction"

RDEPENDS:${PN} += "geronimo-jta-1-1-api \
jakarta-commons-codec \
reload4j \
xerces-j2 \
xml-commons-apis"

inherit rpm

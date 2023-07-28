SUMMARY = "Documentation files to support the YARA malware identification tool"
DESCRIPTION = "Documentation and guideslines to support YARA. \
 \
YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "yara-doc-4.3.2-1.1.noarch.rpm"
RPM_HASH = "3dcf04a9a0d81de5e9a79d4fa47be5704a1df4051881eefc4954ac38492a859eb58574bd6406203f570924b7db10d3767c247447912dd36011d761f03a5ce9bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yara-doc"

RDEPENDS:${PN} += "libyara10"

inherit rpm

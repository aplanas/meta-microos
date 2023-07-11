SUMMARY = "Documentation files to support the YARA malware identification tool"
DESCRIPTION = "Documentation and guideslines to support YARA. \
 \
YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "yara-doc-4.3.1-1.1.noarch.rpm"
RPM_HASH = "32971bc8697a86fce423dd684791f7fc9f6b5e5802093f3e02c222d1566f0756e667a382d3f419c37dc7ab0aade9d3a5da26f6038eac57cd726e06bd3cf159aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yara-doc"

RDEPENDS:${PN} += "libyara10"

inherit rpm

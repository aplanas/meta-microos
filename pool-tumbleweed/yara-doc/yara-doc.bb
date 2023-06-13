SUMMARY = "Documentation files to support the YARA malware identification tool"
DESCRIPTION = "Documentation and guideslines to support YARA. \
 \
YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.0"

RPM_NAME = "yara-doc-4.3.0-1.1.noarch.rpm"
RPM_HASH = "012ebff2468e1632ff0998708b12aa36caf4617153d2da283730721edc31c53801ad7102db6576b237dae2b2705fce62880f0d6b965d2200044375daa46794b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yara-doc"

RDEPENDS:${PN} += "libyara10"

inherit rpm

SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bash style brace expander."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python310-bracex-2.2.1-3.3.noarch.rpm"
RPM_HASH = "ae3c428504fcd32b89a581f77396024fa1c18bf9987cdca4eb8366408c70fb09e908b9f1c4c0a39434a5d74bb723138c0d618fc6a78e420a3ccf31ba4aa35596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bracex \
python310-bracex \
python3dist-bracex"

RDEPENDS:${PN} += "python-abi"

inherit rpm

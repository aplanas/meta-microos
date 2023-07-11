SUMMARY = "BPF Compiler Collection documentation"
DESCRIPTION = "Documentation on how to write programs with the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-docs-0.26.0-2.11.noarch.rpm"
RPM_HASH = "4c7bb2f7973ef5e6d4b703caee1941cad3d85c6317ba4f357dee8313d29f429f203972bd2dba5cf519e9f4b93fb9bae98b1a15e73acf6d793cacfb7fc39cf4c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-docs"

RDEPENDS:${PN} += ""

inherit rpm

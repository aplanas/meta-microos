SUMMARY = "Java-based XML parser"
DESCRIPTION = "AElfred is a Java-based XML parser from Microstar Software Ltd. AElfred \
is distributed for free (with full source) for both commercial and \
non-commercial use."
LICENSE = "BSD-3-Clause"

PV = "7.0"

RPM_NAME = "aelfred-7.0-8.6.noarch.rpm"
RPM_HASH = "fb792ffb2434eb10cc15fce8186f51ecc9ccbe3389c5b878041d593d3eb5072362a2443c7eb452bae2f5edb5b6b5527065bf4b0bf17be0cef37ec5ea45899313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aelfred"

RDEPENDS:${PN} += ""

inherit rpm

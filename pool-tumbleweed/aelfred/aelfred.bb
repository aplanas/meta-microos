SUMMARY = "Java-based XML parser"
DESCRIPTION = "AElfred is a Java-based XML parser from Microstar Software Ltd. AElfred \
is distributed for free (with full source) for both commercial and \
non-commercial use."
LICENSE = "BSD-3-Clause"

PV = "7.0"

RPM_NAME = "aelfred-7.0-8.5.noarch.rpm"
RPM_HASH = "03a394f6b0aebbf79408003be4fd835a7e992fe6e5c3f853f8e3a0863af5cfd82864d66e445119b17ba4e807f65bf4d74b8d1e01244c0d5ae070f366af58cbf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aelfred"

RDEPENDS:${PN} += ""

inherit rpm

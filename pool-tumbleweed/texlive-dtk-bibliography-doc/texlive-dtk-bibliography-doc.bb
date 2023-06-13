SUMMARY = "Documentation for texlive-dtk-bibliography"
DESCRIPTION = "This package includes the documentation for texlive-dtk-bibliography"
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_04svn65444"

RPM_NAME = "texlive-dtk-bibliography-doc-2023.201.2022_04svn65444-52.1.noarch.rpm"
RPM_HASH = "6cfa9f207e94293a0d7d3c22232f72567c8cdb3048870be0fb0fa47b022a9abbca3276009869ca76819fbb9e3ca07f64554f51644acca75c62c911fb86699d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtk-bibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm

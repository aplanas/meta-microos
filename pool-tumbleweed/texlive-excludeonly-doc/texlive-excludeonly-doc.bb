SUMMARY = "Documentation for texlive-excludeonly"
DESCRIPTION = "This package includes the documentation for texlive-excludeonly"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn17262"

RPM_NAME = "texlive-excludeonly-doc-2023.209.1.0svn17262-53.1.noarch.rpm"
RPM_HASH = "2e825ef75e54e85791f343454a0b3a1e2848909104367edc9dbe6bb9bf2b5076b40fbf1a5287f04e417f8e7d35a79e02cf06bded68844ad16a9a2aecb968e94e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-excludeonly-doc"

RDEPENDS:${PN} += ""

inherit rpm

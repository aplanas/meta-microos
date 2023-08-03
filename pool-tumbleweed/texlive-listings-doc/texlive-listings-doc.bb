SUMMARY = "Documentation for texlive-listings"
DESCRIPTION = "This package includes the documentation for texlive-listings"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn66222"

RPM_NAME = "texlive-listings-doc-2023.209.1.9svn66222-55.1.noarch.rpm"
RPM_HASH = "88d5def509805e7ece87d734e264c39f8870b0ed4f7bbe58d040f16146afb395168e9fdb19f8d8d48ea0dea50498d8b89ecf2d2416856d54fced972a2ae9789f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listings-doc"

RDEPENDS:${PN} += ""

inherit rpm

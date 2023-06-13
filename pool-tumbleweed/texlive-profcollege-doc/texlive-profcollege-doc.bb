SUMMARY = "Documentation for texlive-profcollege"
DESCRIPTION = "This package includes the documentation for texlive-profcollege"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.99_z_fsvn66364"

RPM_NAME = "texlive-profcollege-doc-2023.201.0.0.99_z_fsvn66364-52.1.noarch.rpm"
RPM_HASH = "25e64021d58a3e5420a0d291f57ad764b0af17d996876236862a6c7fd958139dfff5f308779979a24c04690937b86d9dee419682e5f606bcf8a4c9ccf778a50b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-profcollege-doc:fr) \
texlive-profcollege-doc"

RDEPENDS:${PN} += ""

inherit rpm

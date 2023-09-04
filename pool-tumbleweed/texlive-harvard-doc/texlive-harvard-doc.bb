SUMMARY = "Documentation for texlive-harvard"
DESCRIPTION = "This package includes the documentation for texlive-harvard"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.5svn15878"

RPM_NAME = "texlive-harvard-doc-2023.209.2.0.5svn15878-54.2.noarch.rpm"
RPM_HASH = "f64a0855b430547997a2286325aef97adce11d17a8c8fad6c583474614f0667a6fd4e8bf13df8aacbbd1f86ea5b6bec0c87b4ac303f26a182a4ad0d0275e8c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvard-doc"

RDEPENDS:${PN} += ""

inherit rpm

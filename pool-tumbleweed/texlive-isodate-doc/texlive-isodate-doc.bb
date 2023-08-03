SUMMARY = "Documentation for texlive-isodate"
DESCRIPTION = "This package includes the documentation for texlive-isodate"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.28svn16613"

RPM_NAME = "texlive-isodate-doc-2023.209.2.28svn16613-56.1.noarch.rpm"
RPM_HASH = "e0808d925eb25a3b6419749e8f81be0c6a173202387a95977c3eed7be3340cc8b600402813bcfbc8ad1ecc0a42e0f76c7984572a3ba7f4c70865793fc0f098e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isodate-doc"

RDEPENDS:${PN} += ""

inherit rpm

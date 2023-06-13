SUMMARY = "Documentation for texlive-expkv-bundle"
DESCRIPTION = "This package includes the documentation for texlive-expkv-bundle"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65623"

RPM_NAME = "texlive-expkv-bundle-doc-2023.201.svn65623-52.1.noarch.rpm"
RPM_HASH = "d0411b64e368db7931b3272121959df26d1b18fb3f3567a94b04bc9dc79817bcacb6f9761ac58a48e5f8f7fdffd430eb26987537d0627f133dac86256dd3cb49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expkv-bundle-doc"

RDEPENDS:${PN} += ""

inherit rpm

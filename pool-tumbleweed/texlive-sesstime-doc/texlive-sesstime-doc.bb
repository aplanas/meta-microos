SUMMARY = "Documentation for texlive-sesstime"
DESCRIPTION = "This package includes the documentation for texlive-sesstime"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn49750"

RPM_NAME = "texlive-sesstime-doc-2023.201.1.12svn49750-53.1.noarch.rpm"
RPM_HASH = "9bc3551e124c338bf12ac12ae797ffb67e3a7b5dd2fa42ef18e6b0860159960049144b95ec5cf3de377bee02a3241f47d7800f4656c083553356e4fb6934a4d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sesstime-doc"

RDEPENDS:${PN} += ""

inherit rpm

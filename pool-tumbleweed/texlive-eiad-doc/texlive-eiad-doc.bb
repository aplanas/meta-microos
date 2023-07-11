SUMMARY = "Documentation for texlive-eiad"
DESCRIPTION = "This package includes the documentation for texlive-eiad"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-eiad-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "a174c53d52a229334ab75a6d2758bbd1a26824b3b374aa9a3868c7cac5919f796133567aa89058722cc402d20d1bf9ae123a57811854c8552648e666984a1402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-doc"

RDEPENDS:${PN} += ""

inherit rpm

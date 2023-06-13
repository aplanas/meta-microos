SUMMARY = "Documentation for texlive-extpfeil"
DESCRIPTION = "This package includes the documentation for texlive-extpfeil"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn16243"

RPM_NAME = "texlive-extpfeil-doc-2023.201.0.0.4svn16243-52.1.noarch.rpm"
RPM_HASH = "31a3428dbfea400f331b4cf386b32eea23fbd96f04a2985a5c1b2cca6433e4122d64f9e77401e7249b810aa6d82e0110a5618b835f013d72d4117f58d553f558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-extpfeil-doc:de) \
texlive-extpfeil-doc"

RDEPENDS:${PN} += ""

inherit rpm

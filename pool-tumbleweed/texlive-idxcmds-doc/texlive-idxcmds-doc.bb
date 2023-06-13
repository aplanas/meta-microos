SUMMARY = "Documentation for texlive-idxcmds"
DESCRIPTION = "This package includes the documentation for texlive-idxcmds"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2csvn54554"

RPM_NAME = "texlive-idxcmds-doc-2023.201.0.0.2csvn54554-52.1.noarch.rpm"
RPM_HASH = "a019851971f25126da7999afeabe0b02b4dd0aac53b8a0a34b3f406c65d9b9c804fadd148177b5164d52628c71f902335537164dc18f80e6fc3727e80dc9671e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-idxcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm

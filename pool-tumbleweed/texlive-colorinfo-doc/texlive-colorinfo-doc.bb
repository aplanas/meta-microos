SUMMARY = "Documentation for texlive-colorinfo"
DESCRIPTION = "This package includes the documentation for texlive-colorinfo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3csvn15878"

RPM_NAME = "texlive-colorinfo-doc-2023.201.0.0.3csvn15878-53.1.noarch.rpm"
RPM_HASH = "f5c86eb6c7f97c16d5657b40e3bfec867c3c5328bc80cd2b4b70c5ee69b901f7113d35ced6d30008b1772fb8fc2c7365e5e0aca6e3d7ccd3e650a36129e35539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm

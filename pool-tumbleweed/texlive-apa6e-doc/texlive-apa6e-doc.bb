SUMMARY = "Documentation for texlive-apa6e"
DESCRIPTION = "This package includes the documentation for texlive-apa6e"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.3svn23350"

RPM_NAME = "texlive-apa6e-doc-2023.201.0.0.3svn23350-54.1.noarch.rpm"
RPM_HASH = "ca367974f7e540d8a562034cac779cd0cbc88495ee0ec2adfa96cbf4de8d4ba265b8a50343b6e6a2c1d27d014251c1cda83101580ce79fc8775a8a23979c98ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa6e-doc"

RDEPENDS:${PN} += ""

inherit rpm

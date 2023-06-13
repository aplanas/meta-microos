SUMMARY = "Documentation for texlive-dynkin-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-dynkin-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415926535897932svn58758"

RPM_NAME = "texlive-dynkin-diagrams-doc-2023.201.3.1415926535897932svn58758-53.1.noarch.rpm"
RPM_HASH = "f933fe68cd7f1cd31dae7f161c37a05caf0bd7263eec9f107b0890f909c02251284481f42e36ecc2e8de0e55e99b60e62a0140c9230440a71d3977b80ce0bc64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynkin-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm

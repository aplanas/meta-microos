SUMMARY = "Documentation for texlive-gfdl"
DESCRIPTION = "This package includes the documentation for texlive-gfdl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn65415"

RPM_NAME = "texlive-gfdl-doc-2023.209.0.0.1svn65415-53.1.noarch.rpm"
RPM_HASH = "a3262cc8d554ec408fee5589aaf5f499e6fcc6b6b68bf868ba977d8310b7399e105a125a728d29f8b1fa2249a34690524501e141811d36ef9276ada211f07c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfdl-doc"

RDEPENDS:${PN} += ""

inherit rpm

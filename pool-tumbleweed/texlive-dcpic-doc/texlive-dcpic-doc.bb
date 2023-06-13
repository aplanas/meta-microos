SUMMARY = "Documentation for texlive-dcpic"
DESCRIPTION = "This package includes the documentation for texlive-dcpic"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0.0svn30206"

RPM_NAME = "texlive-dcpic-doc-2023.201.5.0.0svn30206-52.1.noarch.rpm"
RPM_HASH = "f34b5c46186b6ec877b48e880fd9149dc55ca696dc144b3351d198a468df62921b288fe96aae74aa40545acbbcc00757c7a684551266a239bca07490949e78dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-dcpic-doc:en;pt) \
texlive-dcpic-doc"

RDEPENDS:${PN} += ""

inherit rpm

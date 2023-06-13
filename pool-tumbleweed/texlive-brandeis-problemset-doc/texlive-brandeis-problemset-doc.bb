SUMMARY = "Documentation for texlive-brandeis-problemset"
DESCRIPTION = "This package includes the documentation for texlive-brandeis-problemset"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.5svn50991"

RPM_NAME = "texlive-brandeis-problemset-doc-2023.201.0.0.5.5svn50991-52.1.noarch.rpm"
RPM_HASH = "e3f8e111744aace50a7f1e2e3799da9ca43bbdb52b012ec3366d717552f9bc939df13b313ba96b5029dc04959799f7e25e7491bfb106444d6710183f80527f1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brandeis-problemset-doc"

RDEPENDS:${PN} += ""

inherit rpm

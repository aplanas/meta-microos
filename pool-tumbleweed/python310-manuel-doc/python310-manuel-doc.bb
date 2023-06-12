SUMMARY = "Build tested documentation"
DESCRIPTION = "This package contains documentation files for python310-manuel."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python310-manuel-doc-1.12.4-4.1.noarch.rpm"
RPM_HASH = "01e854f27bece889bc30feef26f672d43cdacca0a30339b38ad17535726bbe55609a23ee8fb56cf6667afefa602020db26e66352f8c1eae9e07c8cfc8e7dd403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manuel-doc \
python310-manuel-doc"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for dpic"
DESCRIPTION = " \
This package contains the documentation for dpic."
LICENSE = "BSD-2-Clause & CC-BY-3.0"

PV = "2023.02.01"

RPM_NAME = "dpic-doc-2023.02.01-1.4.noarch.rpm"
RPM_HASH = "19592318d68968096e6cb857508d7d30c0f137e7ae029b76b53c6b7fc77e70bf1399d5196f9b5a7dddf3040fb6983a6eb5f11af08c4fd43e7c529e98f9a2fe13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpic-doc"

RDEPENDS:${PN} += "dpic"

inherit rpm

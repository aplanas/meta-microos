SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-pdm-pep517-1.1.2-1.2.noarch.rpm"
RPM_HASH = "4c25227d2da8013331eeba2f3f5edb96d06418db069c2e0756b1660353812f2cfb188d86e5978b846034e29ca9d5d11596569f9df1c16979ea1ac53f8843427e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pdm-pep517) \
python311-pdm-pep517 \
python3dist(pdm-pep517)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

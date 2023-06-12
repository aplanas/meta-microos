SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-pdm-pep517-1.1.2-1.2.noarch.rpm"
RPM_HASH = "0d1c3f23a0ce0c2653cba05736e8ad83a9f4d2607124bbd7c774477f1b84f58d4ba9db97f419985badcd592cd89cb66103e021dfedd76966573d0d66569cf335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pdm-pep517) \
python39-pdm-pep517 \
python3dist(pdm-pep517)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

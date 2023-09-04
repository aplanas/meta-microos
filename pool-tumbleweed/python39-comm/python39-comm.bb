SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "python39-comm-0.1.4-1.1.noarch.rpm"
RPM_HASH = "8c80905b03ee66cc603578563b66210e9107448e4223204ecb98bdbc839f7715bd9de5be7e3eb3bafb0e60c3a0b0c767c27e357b8116bd9614f1300e0caee509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-comm \
python39-comm \
python3dist-comm"

RDEPENDS:${PN} += "python-abi \
python39-traitlets"

inherit rpm

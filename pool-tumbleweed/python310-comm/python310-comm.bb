SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "python310-comm-0.1.4-1.1.noarch.rpm"
RPM_HASH = "039f0f51ce9e665921afaa27bb32f262b427b9216a9eaf843a82c2a549137d541d2c27ba6e26f83fe780bdfafe2923d805f0b8321e452f8a229ef2c83e1bc9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-comm \
python310-comm \
python3dist-comm"

RDEPENDS:${PN} += "python-abi \
python310-traitlets"

inherit rpm

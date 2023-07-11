SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python310-comm-0.1.3-1.3.noarch.rpm"
RPM_HASH = "51ff440d3c9209a430effa585b4e1b01a596b32a856f2473a648eec0435d92a2242eae0c92522b18a2f74d1dcdc66067f3fa3f2250fafd55da8f14093fba4145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-comm \
python310-comm \
python3dist-comm"

RDEPENDS:${PN} += "python-abi \
python310-traitlets"

inherit rpm

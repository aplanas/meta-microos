SUMMARY = "Microsoft Azure Mixed Reality Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mixedreality namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mixedreality-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "14da56517ecd29c03c9fb7f278ed61e38bede4d491bfbd9653bcfeba2c845c246a8631c5deae2131fa5e5e9b885fc9b94d665eac09ebaf23fa6cc40520a22811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mixedreality-nspkg) \
python311-azure-mixedreality-nspkg \
python3dist(azure-mixedreality-nspkg)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-nspkg"

inherit rpm

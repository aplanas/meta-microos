SUMMARY = "Microsoft Azure IoT namespace package"
DESCRIPTION = "This is the Microsoft Azure IoT namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.iot namespace."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-azure-iot-nspkg-1.0.1-1.2.noarch.rpm"
RPM_HASH = "8bc738331b374db0e779a22cd150eb52bed5255b6734ce8109c438fefbab07c235dd0416017d58d4fd83ac6d23973c6556df3bc46be866558a4b3e3fd5532dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-iot-nspkg \
python39-azure-iot-nspkg \
python3dist-azure-iot-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm

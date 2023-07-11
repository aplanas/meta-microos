SUMMARY = "A loader interface around multiple config file formats"
DESCRIPTION = "Plaster is a loader interface around multiple config file formats. \
It exists to define a common API for applications to use when they \
wish to load a configuration. The library itself does not aim to \
handle anything except a basic API that applications may use to find \
and load configuration settings. Any specific constraints should be \
implemented in a pluggable loader which can be registered via an \
entrypoint."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-plaster-1.1.2-2.3.noarch.rpm"
RPM_HASH = "d7c6ed3b8f9c126823929988cbd4280c41a53c74fdac70fd9d63532ee64acba12b65d80bb975991d658d2a63d6e98bf603932195bc55ebc6486a4b3fef7f22fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plaster \
python3.11dist-plaster \
python311-plaster \
python3dist-plaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm

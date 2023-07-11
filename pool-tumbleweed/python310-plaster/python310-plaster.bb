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

RPM_NAME = "python310-plaster-1.1.2-2.3.noarch.rpm"
RPM_HASH = "05ef0cfe7c329eb25e5aa3016763e3a05dc28311e403e7d92df6bd17961ec903048515507a09c30661dbce6105427419b9984cdb56ecfb81657d260fe21d2072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-plaster \
python310-plaster \
python3dist-plaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm

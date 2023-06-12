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

RPM_NAME = "python311-plaster-1.1.2-1.3.noarch.rpm"
RPM_HASH = "4924636287475e7abf2a045e75eaeff4bcf9f5f7b3d265d62c174ed1685482dca44b171e45bf4a4edad74bf27843d9de51d601aab4174533476f20cf1c53c3d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(plaster) \
python311-plaster \
python3dist(plaster)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

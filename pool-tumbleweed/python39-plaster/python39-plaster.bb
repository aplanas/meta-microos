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

RPM_NAME = "python39-plaster-1.1.2-2.3.noarch.rpm"
RPM_HASH = "6cc7420cc700349c9d38877918fd4922fae53599b2f1b48122e59d0b0d82436a155a59c8ededdd2f2b08319f0db1dbae8e79f0b1f713f401ca28ffff169806eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-plaster \
python39-plaster \
python3dist-plaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm

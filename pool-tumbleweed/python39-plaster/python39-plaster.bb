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

RPM_NAME = "python39-plaster-1.1.2-1.3.noarch.rpm"
RPM_HASH = "82f744a5e4b96cc0f4d4e6c7796a6ada7936897553a2fd55f65bbf1abf2b73b06c539f79f95f3e60b27a55336c19a27688527a05f501e9b5456dde45ebd1a173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-plaster \
python39-plaster \
python3dist-plaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm

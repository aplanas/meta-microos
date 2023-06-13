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

RPM_NAME = "python310-plaster-1.1.2-1.3.noarch.rpm"
RPM_HASH = "d764ec12db603a75d71a6d3f7dfd2c285f37ddcfcc06b4d3089a6a66d5aacec4f4b387328247ffc9e21c1edb1a14cba8d48173dfde404543592dac309fd4b7f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plaster \
python3.10dist(plaster) \
python310-plaster \
python3dist(plaster)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

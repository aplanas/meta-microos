SUMMARY = "Implementations of the Buttplug Client for Python"
DESCRIPTION = "Buttplug-py is a python implementation of the Core and Client portions of \
the Buttplug Sex Toy Control Protocol. It allows users to write applications \
that can connect to Buttplug Servers, such as the Intiface Desktop \
Application or Intiface C# CLI or Node CLI."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-buttplug-0.2.0-4.6.noarch.rpm"
RPM_HASH = "c60cff5d56b9ee44c71cbe5dfdea3c08de4e4905ec1a96e9b5c9df8220a1cd07d83159571e7b8f1d08a9588dff9666aa55d9b9cdeea14f81cf1fc90a39135ad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-buttplug \
python3.10dist(buttplug) \
python310-buttplug \
python3dist(buttplug)"

RDEPENDS:${PN} += "python(abi) \
python310-websockets"

inherit rpm

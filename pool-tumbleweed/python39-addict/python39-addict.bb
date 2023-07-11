SUMMARY = "A dictionary using both attribute and item syntax"
DESCRIPTION = "Addict is a module that exposes a dictionary subclass that allows \
items to be set like attributes. Values are gettable and settable \
using both attribute and item syntax."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-addict-2.4.0-1.10.noarch.rpm"
RPM_HASH = "438d3eed0a33f6542c76e9c6affc909bb41223b2ace5698ce64574da8533260f7a0fd663b22c82bb6c7f27cad0e18eb3a00051e0921c86c29d8d9b86415ec08d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-addict \
python39-addict \
python3dist-addict"

RDEPENDS:${PN} += "python-abi"

inherit rpm

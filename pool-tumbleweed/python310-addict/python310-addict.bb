SUMMARY = "A dictionary using both attribute and item syntax"
DESCRIPTION = "Addict is a module that exposes a dictionary subclass that allows \
items to be set like attributes. Values are gettable and settable \
using both attribute and item syntax."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-addict-2.4.0-1.10.noarch.rpm"
RPM_HASH = "143d6bdaf371fea86f0c8926dff6112b473bf05abc01ccf0aee3df5b7874a92489e9801076703daaf02e64b57e8675a174f9bbc36d9ace903deb125d8be523ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-addict \
python310-addict \
python3dist-addict"

RDEPENDS:${PN} += "python-abi"

inherit rpm

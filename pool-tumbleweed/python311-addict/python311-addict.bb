SUMMARY = "A dictionary using both attribute and item syntax"
DESCRIPTION = "Addict is a module that exposes a dictionary subclass that allows \
items to be set like attributes. Values are gettable and settable \
using both attribute and item syntax."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-addict-2.4.0-1.10.noarch.rpm"
RPM_HASH = "7135171f05731e9acb69903149892ddf145202a2cd149d5c034bce85ee92531a0aeda32fc8e19fa95254a9fb226a74e8551d96b0481294e396f962600c7cdd69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-addict \
python3.11dist-addict \
python311-addict \
python3dist-addict"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Implementations of the Buttplug Client for Python"
DESCRIPTION = "Buttplug-py is a python implementation of the Core and Client portions of \
the Buttplug Sex Toy Control Protocol. It allows users to write applications \
that can connect to Buttplug Servers, such as the Intiface Desktop \
Application or Intiface C# CLI or Node CLI."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-buttplug-0.2.0-4.8.noarch.rpm"
RPM_HASH = "93fe7c72083ff1f0896ca878303b319f8226f68966739058a47b5655ab97ec326ebf2437e09486e46ae860da5ae917c288aa868391b19029e77be92fb689736a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-buttplug \
python310-buttplug \
python3dist-buttplug"

RDEPENDS:${PN} += "python-abi \
python310-websockets"

inherit rpm

SUMMARY = "Implementations of the Buttplug Client for Python"
DESCRIPTION = "Buttplug-py is a python implementation of the Core and Client portions of \
the Buttplug Sex Toy Control Protocol. It allows users to write applications \
that can connect to Buttplug Servers, such as the Intiface Desktop \
Application or Intiface C# CLI or Node CLI."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-buttplug-0.2.0-4.8.noarch.rpm"
RPM_HASH = "acb55e78f95c46310e5744ca03d87214d3a43bb201b24f33b35a47f8e0e9da991fa95aa474fcce8eab148f8301d1ba1fbe4bbdef05e2f1a8ba5a2f019416b74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-buttplug \
python39-buttplug \
python3dist-buttplug"

RDEPENDS:${PN} += "python-abi \
python39-websockets"

inherit rpm

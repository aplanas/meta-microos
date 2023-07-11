SUMMARY = "Implementations of the Buttplug Client for Python"
DESCRIPTION = "Buttplug-py is a python implementation of the Core and Client portions of \
the Buttplug Sex Toy Control Protocol. It allows users to write applications \
that can connect to Buttplug Servers, such as the Intiface Desktop \
Application or Intiface C# CLI or Node CLI."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-buttplug-0.2.0-4.8.noarch.rpm"
RPM_HASH = "77c313107cfbb5e5cdd60eec246cda8adcc8e577ace8e0a156a21ebff5af66c3a8c9f260b8e02973de28c9f82502c8c607c1ee921def12bb7a20fb0a9f5ce32d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-buttplug \
python3.11dist-buttplug \
python311-buttplug \
python3dist-buttplug"

RDEPENDS:${PN} += "python-abi \
python311-websockets"

inherit rpm

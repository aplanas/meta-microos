SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.9.0"

RPM_NAME = "python39-flit-core-3.9.0-1.1.noarch.rpm"
RPM_HASH = "6d486046abc2d2cf93277b04f61800420cc28c8233003b1262b2d74553df02eef3abf618454c768e77bf418f9d78b2949f8bcc4e0f31c9fcfa81ebe65f44c550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flit-core \
python39-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.9.0"

RPM_NAME = "python311-flit-core-3.9.0-1.1.noarch.rpm"
RPM_HASH = "e386dfb8edf5fc7b469769c4d09861da7787b13736a6701528949830a745af11e7f773b4caeec60be090626ec767a2a955a635ea6461af5bbceb3a2aedf9f839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit-core \
python3.11dist-flit-core \
python311-flit-core \
python3dist-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm

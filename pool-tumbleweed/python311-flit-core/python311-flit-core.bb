SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.8.0"

RPM_NAME = "python311-flit-core-3.8.0-4.3.noarch.rpm"
RPM_HASH = "b9fb9aaab3b563e2d47bb5e44a8c6ccc1eda660de8e917f739667c220d5556700a7de34997bd92180c34ded1f3458eab1de6646c2bcf8379f494745954b82e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit-core \
python3.11dist-flit-core \
python311-flit-core \
python3dist-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.8.0"

RPM_NAME = "python310-flit-core-3.8.0-4.1.noarch.rpm"
RPM_HASH = "b6e24b18e10934459d87e910b44b8085c6fd0f872d2fc367af877cbb25888407bf3b779e70731edd408f2742817e9109867dfdc524525432ac2c3b65c4699e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit-core \
python3.10dist-flit-core \
python310-flit-core \
python3dist-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm

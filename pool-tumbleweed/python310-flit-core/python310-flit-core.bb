SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.9.0"

RPM_NAME = "python310-flit-core-3.9.0-1.1.noarch.rpm"
RPM_HASH = "ff4fad8169c89b16ed41181e64b6444a3f778a193e08d68b99f6eb4f61819f67a7a2166311d4bc23ea5a226b5df8ef47ae05389dd2a1241560737524796285ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flit-core \
python310-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm

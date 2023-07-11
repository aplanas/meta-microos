SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.8.0"

RPM_NAME = "python39-flit-core-3.8.0-4.2.noarch.rpm"
RPM_HASH = "fe15c40155178a32d2d998143a7fcbf522a458b76a4fb626d4e148875fc186475113eb7a3d0d314e6ba8c32295de688f84d1c9524e33ee4f4dc96616d846c9c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flit-core \
python39-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm

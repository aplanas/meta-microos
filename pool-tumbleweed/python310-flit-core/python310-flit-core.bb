SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.8.0"

RPM_NAME = "python310-flit-core-3.8.0-4.2.noarch.rpm"
RPM_HASH = "32d54dc8a4fc2d41740d5d7c77a7d63ca0a38fbd10d655028b772823b76067e9333d82ff965f63ae053eba3bbc06a03d9357a80ac30875439e3c420f4e457733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flit-core \
python310-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm

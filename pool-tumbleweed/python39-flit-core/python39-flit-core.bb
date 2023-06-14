SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.8.0"

RPM_NAME = "python39-flit-core-3.8.0-4.1.noarch.rpm"
RPM_HASH = "a5728c2728ec3da28fe4c7836a5c6ccce85ad69d13c04acfe8e1a421fa532194163a6fd8b82d0bd8943afb242d9d1a4ca6bccd08f931488b28e86dccaa57d30d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flit-core \
python39-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm

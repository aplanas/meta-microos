SUMMARY = "Extended pickling support for Python objects"
DESCRIPTION = "The cloudpickle package makes it possible to serialize Python constructs \
not supported by the default pickle module from the Python standard \
library. \
 \
cloudpickle is especially useful for cluster computing where Python \
expressions are shipped over the network to execute on remote hosts, \
possibly close to the data. \
 \
Among other things, cloudpickle supports pickling for lambda expressions, \
functions and classes defined interactively in the __main__ module."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python39-cloudpickle-2.2.1-2.3.noarch.rpm"
RPM_HASH = "edfeb8aa282d51f74ce54bd5e02511e5d53e18c7b78afb1729f19ae861271f5d092058c036e67a8b92a58b6d651870306c658db9a4bc2e393e42c92c912de303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cloudpickle \
python39-cloudpickle \
python3dist-cloudpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm

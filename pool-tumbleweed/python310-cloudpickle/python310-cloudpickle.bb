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

RPM_NAME = "python310-cloudpickle-2.2.1-2.3.noarch.rpm"
RPM_HASH = "3583d727fbd54f7659f3aa44c4c28842dcf25e61273e8d6fe04b90362b5f7318f7b7058b389035bde008b57b8a1a4531b87a84b70878a9416a378c9b3cd6f695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cloudpickle \
python310-cloudpickle \
python3dist-cloudpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm

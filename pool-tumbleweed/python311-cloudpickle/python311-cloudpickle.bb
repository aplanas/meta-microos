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

RPM_NAME = "python311-cloudpickle-2.2.1-2.3.noarch.rpm"
RPM_HASH = "8dcd84e7a67c225750affebe7435e5b7d5fdd66fc4cd7e67165c2afda6ca620bac02a6276f920a36be6c5087cdb5641ace7db206d089ecf6568432a25d96116e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudpickle \
python3.11dist-cloudpickle \
python311-cloudpickle \
python3dist-cloudpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm

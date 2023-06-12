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

RPM_NAME = "python311-cloudpickle-2.2.1-1.1.noarch.rpm"
RPM_HASH = "1be17c19eb99f7efd03cfd64c36a5328a3b35ec0b0ab70212bf0d2e706d455fddaa480cdb656b293e9a4b15d4c9785cdd97e78ea83c09548879b208e671ff0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cloudpickle) \
python311-cloudpickle \
python3dist(cloudpickle)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

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

RPM_NAME = "python310-cloudpickle-2.2.1-1.1.noarch.rpm"
RPM_HASH = "ed81413c7abe9990f220403a87b4129c558e12d9eeabdb593441cb2d2dcc90c3653c7fc9ac1ba2bf12ffb667d6ecc1528bfe047234e4787dfe0a88895d3954b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudpickle \
python3.10dist(cloudpickle) \
python310-cloudpickle \
python3dist(cloudpickle)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

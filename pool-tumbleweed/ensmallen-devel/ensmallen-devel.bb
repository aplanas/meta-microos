SUMMARY = "Math optimization C++ library"
DESCRIPTION = "ensmallen provides a set of abstractions for writing an objective \
function to optimize. It also provides a set of standard and \
optimizers that can be used for mathematical optimization tasks. \
These include full-batch gradient descent techniques, small-batch \
techniques, gradient-free optimizers, and constrained optimization."
LICENSE = "BSD-3-Clause & MPL-2.0 & BSL-1.0"

PV = "2.19.1"

RPM_NAME = "ensmallen-devel-2.19.1-1.3.aarch64.rpm"
RPM_HASH = "109a4c689558892f6bf5283479a2716b9cdcd447b1065063fc4125b4aea149c3ab56c32919fa9585cf963e9266c7c165ff28e1802ca64e784494c7e38f4d7965"

RPROVIDES:${PN} += "cmake-ensmallen \
ensmallen-devel"

RDEPENDS:${PN} += ""

inherit rpm

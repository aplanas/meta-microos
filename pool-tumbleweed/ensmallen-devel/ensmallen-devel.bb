SUMMARY = "Math optimization C++ library"
DESCRIPTION = "ensmallen provides a set of abstractions for writing an objective \
function to optimize. It also provides a set of standard and \
optimizers that can be used for mathematical optimization tasks. \
These include full-batch gradient descent techniques, small-batch \
techniques, gradient-free optimizers, and constrained optimization."
LICENSE = "BSD-3-Clause & MPL-2.0 & BSL-1.0"

PV = "2.19.1"

RPM_NAME = "ensmallen-devel-2.19.1-1.2.aarch64.rpm"
RPM_HASH = "527c37e1f7f26214b1674b1b0c314154fdc3e1c27b3251411ca8373332dfb71adf2fccef12f13403cf008d5625ac84ed14725ba396f38f8ef5d0904ac120d92f"

RPROVIDES:${PN} += "cmake(ensmallen) \
ensmallen-devel \
ensmallen-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

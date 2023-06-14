SUMMARY = "A Python module for decorators, wrappers and monkey patching"
DESCRIPTION = "The aim of the **wrapt** module is to provide a transparent object proxy \
for Python, which can be used as the basis for the construction of function \
wrappers and decorator functions. \
 \
The **wrapt** module focuses very much on correctness. It therefore goes \
way beyond existing mechanisms such as ``functools.wraps()`` to ensure that \
decorators preserve introspectability, signatures, type checking abilities \
etc. The decorators that can be constructed using this module will work in \
far more scenarios than typical decorators and provide more predictable and \
consistent behaviour. \
 \
To ensure that the overhead is as minimal as possible, a C extension module \
is used for performance critical components. An automatic fallback to a \
pure Python implementation is also provided where a target system does not \
have a compiler to allow the C extension to be compiled. \
 \
Documentation \
------------- \
 \
For further information on the **wrapt** module see: \
 \
* http://wrapt.readthedocs.org/"
LICENSE = "BSD-2-Clause"

PV = "1.15.0"

RPM_NAME = "python39-wrapt-1.15.0-1.1.aarch64.rpm"
RPM_HASH = "86caf1e9d1639ab117abbc0c9a70e8f9eede1e234c25312dd13c738f690907820fc1bbebd19fbf1d24d4de56c498c5d64659a851fbc0e1c5df0e2dffb9b0ab64"

RPROVIDES:${PN} += "python3.9dist-wrapt \
python39-wrapt \
python3dist-wrapt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

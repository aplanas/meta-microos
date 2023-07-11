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

RPM_NAME = "python39-wrapt-1.15.0-1.3.aarch64.rpm"
RPM_HASH = "7c085d35f7b6ae42da059ecf1a555ee3b7f749c8e935cd4cf82af93b7a972f748e4997c969b3b33c2fdf9dded9f8b7fceaf41bed50f550762f34389ec63e81d6"

RPROVIDES:${PN} += "python3.9dist-wrapt \
python39-wrapt \
python3dist-wrapt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

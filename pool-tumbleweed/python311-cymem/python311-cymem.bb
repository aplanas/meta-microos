SUMMARY = "Manage calls to calloc/free through Cython"
DESCRIPTION = " \
 \
cymem provides two small memory-management helpers for Cython. They make it \
easy to tie memory to a Python object's life-cycle, so that the memory is freed \
when the object is garbage collected. \
 \
 \
 \
The most useful is `cymem.Pool`, which acts as a thin wrapper around the calloc \
function: \
 \
```python \
from cymem.cymem cimport Pool \
cdef Pool mem = Pool() \
data1 = <int*>mem.alloc(10, sizeof(int)) \
data2 = <float*>mem.alloc(12, sizeof(float)) \
``` \
 \
The `Pool` object saves the memory addresses internally, and frees them when the \
object is garbage collected. Typically you'll attach the `Pool` to some cdef'd \
class. This is particularly handy for deeply nested structs, which have \
complicated initialization functions. Just pass the `Pool` object into the \
initializer, and you don't have to worry about freeing your struct at all — \
all of the calls to `Pool.alloc` will be automatically freed when the `Pool` \
expires."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python311-cymem-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "f66ba9b53fc2909d77d0f31e5c0ea405fe62fcd55d2d2ba540c675cfbb0bf98643a8375c331106326659a78a6d60ccff451f78c7a48c1bedbcf44d9631c44b83"

RPROVIDES:${PN} += "python3-cymem \
python3.11dist-cymem \
python311-cymem \
python3dist-cymem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

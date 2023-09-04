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

RPM_NAME = "python310-cymem-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "10dbaf1d2e9668484ae562fe13c513bc756973bef2075602321e64e84a54b86d2adc172698d5bdb27923d3328c4c6c5fc4e4f095fa0517b5054cf16a5635f75f"

RPROVIDES:${PN} += "python3.10dist-cymem \
python310-cymem \
python3dist-cymem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

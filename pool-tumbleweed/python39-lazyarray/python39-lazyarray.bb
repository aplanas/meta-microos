SUMMARY = "Lazily-evaluated numerical array class, compatible with NumPy arrays"
DESCRIPTION = "lazyarray is a Python package that provides a lazily-evaluated numerical array \
class, larray, based on and compatible with NumPy arrays. \
 \
Lazy evaluation means that any operations on the array (potentially including \
array construction) are not performed immediately, but are delayed until \
evaluation is specifically requested. Evaluation of only parts of the array is \
also possible. \
 \
Use of an larray`can potentially save considerable computation time \
and memory in cases where: \
 \
* arrays are used conditionally (i.e. there are cases in which the array is \
  never used) \
* only parts of an array are used (for example in distributed computation, \
  in which each MPI node operates on a subset of the elements of the array)"
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python39-lazyarray-0.5.2-1.8.noarch.rpm"
RPM_HASH = "9bc5e4d74c74908f903e964d8430886768104bc7d9a1843b94fe412d0a97dc9776736e008ee5a7ddd3852d42895bb8aaa5d7796feac79ced2da412cfd58edf69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lazyarray \
python39-lazyarray \
python3dist-lazyarray"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm

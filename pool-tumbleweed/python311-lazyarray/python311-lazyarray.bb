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

RPM_NAME = "python311-lazyarray-0.5.2-1.6.noarch.rpm"
RPM_HASH = "8ce59df3ab992f63f807575b3cab7825bc0ce400a4a4493a97f9d1339718b28f96ac87cb113e88bd5a5938c6451354f910e90c7fc718e46b6e416c64e1a4b37b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lazyarray) \
python311-lazyarray \
python3dist(lazyarray)"

RDEPENDS:${PN} += "python(abi) \
python311-numpy"

inherit rpm

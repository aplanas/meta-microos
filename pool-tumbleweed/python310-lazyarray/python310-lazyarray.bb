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

RPM_NAME = "python310-lazyarray-0.5.2-1.6.noarch.rpm"
RPM_HASH = "40c2c7b96892b98608206826c1abb1382027b92b57e77830165a58ce315842381b67da456b380364dc39b6beb25d11cbb4702b607b55a9944260c490c93e4ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazyarray \
python3.10dist(lazyarray) \
python310-lazyarray \
python3dist(lazyarray)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy"

inherit rpm

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

RPM_NAME = "python311-lazyarray-0.5.2-1.8.noarch.rpm"
RPM_HASH = "41046f9a25a5029d812709b023f3d80497b80ac5a98e64a0053d733f92470600c9d29b0a6765047905c7da6ebe52dfe68c273ae1a32ea564ffa322d612569293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazyarray \
python3.11dist-lazyarray \
python311-lazyarray \
python3dist-lazyarray"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm

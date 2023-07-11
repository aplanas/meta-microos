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

RPM_NAME = "python310-lazyarray-0.5.2-1.8.noarch.rpm"
RPM_HASH = "ee0c69a26b35e1eb55b05e9b8313b334fcd2a19265516b1a9a46a863d6a9feaae1125ff8431d1401ff6f759910ae743998a2ce22688601f843535d9f93885d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lazyarray \
python310-lazyarray \
python3dist-lazyarray"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm

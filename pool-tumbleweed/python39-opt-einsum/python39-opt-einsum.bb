SUMMARY = "Optimizing numpys einsum function"
DESCRIPTION = "Optimized einsum can significantly reduce the overall execution time of einsum-like expressions (e.g., \
`np.einsum`,`dask.array.einsum`,`pytorch.einsum`,`tensorflow.einsum`) \
by optimizing the expression's contraction order and dispatching many \
operations to canonical BLAS, cuBLAS, or other specialized routines. Optimized \
einsum is agnostic to the backend and can handle NumPy, Dask, PyTorch, \
Tensorflow, CuPy, Sparse, Theano, JAX, and Autograd arrays as well as potentially \
any library which conforms to a standard API. See the \
[**documentation**](http://optimized-einsum.readthedocs.io) for more \
information."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-opt-einsum-3.3.0-2.7.noarch.rpm"
RPM_HASH = "a609207052f01a63fd33b32ef855bad6e2d4989fc5f6d8e422b1713b20eacd83b8eabb9bc5f3bdd4700d58843c381a3b5d5d79ff31cd4a0bee4326bd06d9dcf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opt-einsum \
python39-opt-einsum \
python3dist-opt-einsum"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm

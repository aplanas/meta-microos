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

RPM_NAME = "python39-opt-einsum-3.3.0-2.9.noarch.rpm"
RPM_HASH = "647cf9f20ffea0c8cb306c2e1b46e86bdf1843b65ad8661ae813daf3269f775da5bcfe8d7704ed1758b82928b980828e060c6a6e80b7ee27aa9024fff84eeb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opt-einsum \
python39-opt-einsum \
python3dist-opt-einsum"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm

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

RPM_NAME = "python311-opt-einsum-3.3.0-2.7.noarch.rpm"
RPM_HASH = "804530a88ab7c20628285844b4fe546b47057f167b5ecbe2b41e5e0b4dbc88a70c459586886f42ef173418eaa3f84633e00582eca64854e2f1e73e8764f1dcb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(opt-einsum) \
python311-opt-einsum \
python3dist(opt-einsum)"

RDEPENDS:${PN} += "python(abi) \
python311-numpy"

inherit rpm

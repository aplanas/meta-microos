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

RPM_NAME = "python311-opt-einsum-3.3.0-2.9.noarch.rpm"
RPM_HASH = "d30416c80cb0e42b1536b155d189bda61493c18fb0ca954cd8dd96922eab85b35f798dc3b5a031f285b355117d9aa77710e463a9b6ae7da90795404935989eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opt-einsum \
python3.11dist-opt-einsum \
python311-opt-einsum \
python3dist-opt-einsum"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm

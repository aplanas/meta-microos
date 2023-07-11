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

RPM_NAME = "python310-opt-einsum-3.3.0-2.9.noarch.rpm"
RPM_HASH = "97c6ae4537e5ef24677dc8d6dc08a66ccc500783ebcbccee1d214dc93a402a58cc2f18216be539700109cce709ec2633c5816281200126f74d3e108145ce4de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opt-einsum \
python310-opt-einsum \
python3dist-opt-einsum"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm

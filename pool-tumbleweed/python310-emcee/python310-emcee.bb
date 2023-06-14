SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python310-emcee-3.1.4-1.3.noarch.rpm"
RPM_HASH = "9da48b184da780d89a6531448728a44a7e0e9c94d66c94e8f7bedafc202d3b2e3a033df4b2de4eb0879b7b2c5c322b6578544a232e1c4c0785855cb77fb4706f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emcee \
python3.10dist-emcee \
python310-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python310-h5py \
python310-numpy \
python310-scipy"

inherit rpm

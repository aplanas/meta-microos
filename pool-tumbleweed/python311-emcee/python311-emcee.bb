SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python311-emcee-3.1.4-1.3.noarch.rpm"
RPM_HASH = "a6be31c9a7daab874786abf07d12680f816b243eec1472acb1bbe780e11d58e21808b7e59c2417b4cadbd7e724ff65423ec1382cf0e0e10e7a1be2b1112da8ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(emcee) \
python311-emcee \
python3dist(emcee)"

RDEPENDS:${PN} += "python(abi) \
python311-h5py \
python311-numpy \
python311-scipy"

inherit rpm

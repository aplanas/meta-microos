SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python39-emcee-3.1.4-1.5.noarch.rpm"
RPM_HASH = "3a745e7c4d80050da160e05a68bdde7a0f1b17f338681c20f1d3c3f10667faef3949ecd886f3097148d431277dfc1d7ece2b74e273183d92f1cd3fd48ced7647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-emcee \
python39-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python39-h5py \
python39-numpy \
python39-scipy"

inherit rpm

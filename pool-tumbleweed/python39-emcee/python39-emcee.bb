SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python39-emcee-3.1.4-1.3.noarch.rpm"
RPM_HASH = "b5d3fee607607ab616bbdbd4df79e045d32bd71b11ff6b25fde8e82327fc40fe4a6795f308ff7fccef5b44064ed8e119c3bab9736d74c7dec2a8c71bb76b5dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-emcee \
python39-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python39-h5py \
python39-numpy \
python39-scipy"

inherit rpm

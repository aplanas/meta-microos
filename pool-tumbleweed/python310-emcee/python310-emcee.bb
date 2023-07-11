SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python310-emcee-3.1.4-1.5.noarch.rpm"
RPM_HASH = "4148162a7346aaf463f5a36dccf7966855cf098dda6fe61e71712ff1a3783e111024b2cc08513d69eefb6e1d0a87bfe51e632992f13520bc9ec5bdb9c2148bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-emcee \
python310-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python310-h5py \
python310-numpy \
python310-scipy"

inherit rpm

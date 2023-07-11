SUMMARY = "Python affine-invariant ensemble MCMC sampling"
DESCRIPTION = "Emcee is a  Python implementation of the affine-invariant \
ensemble sampler for Markov chain Monte Carlo (MCMC) \
proposed by Goodman & Weare (2010) \
 \
http://cims.nyu.edu/~weare/papers/d13.pdf"
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "python311-emcee-3.1.4-1.5.noarch.rpm"
RPM_HASH = "1c9839a211c9ab69107c6df44d6f1918bd402d44271e77d6326be108c11b23bad5b15932532afe77b4b069df5708c98f31025c377c9a54ecd84184e38989a94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emcee \
python3.11dist-emcee \
python311-emcee \
python3dist-emcee"

RDEPENDS:${PN} += "python-abi \
python311-h5py \
python311-numpy \
python311-scipy"

inherit rpm

SUMMARY = "Tensor-based phase-Amplitude coupling package"
DESCRIPTION = "Tensorpac is an Python toolbox for computing Phase-Amplitude Coupling \
(PAC) using tensors and parallel computing."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python39-tensorpac-1.1-2.5.noarch.rpm"
RPM_HASH = "250cdcd931ed514f41524be58652a82106114420c6fba92c9acbf9d294a9309f86533d70331b4cdf21aea87dfd47084b680af74d5ddf8e2a8213d2bdfa5bb053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tensorpac \
python39-tensorpac \
python3dist-tensorpac"

RDEPENDS:${PN} += "python-abi \
python39-joblib \
python39-numpy \
python39-scipy"

inherit rpm

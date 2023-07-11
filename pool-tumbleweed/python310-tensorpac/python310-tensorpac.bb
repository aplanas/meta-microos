SUMMARY = "Tensor-based phase-Amplitude coupling package"
DESCRIPTION = "Tensorpac is an Python toolbox for computing Phase-Amplitude Coupling \
(PAC) using tensors and parallel computing."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python310-tensorpac-1.1-2.5.noarch.rpm"
RPM_HASH = "e7cbeee7e4610bff16504311ba12e8a96ba244cce78c79e2939f5645c694c88f793cee3438b0a9fd33a672eacc4696f10f405e6eb88d39dc3e9356fa63632d27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tensorpac \
python310-tensorpac \
python3dist-tensorpac"

RDEPENDS:${PN} += "python-abi \
python310-joblib \
python310-numpy \
python310-scipy"

inherit rpm

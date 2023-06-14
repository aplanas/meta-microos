SUMMARY = "Tensor-based phase-Amplitude coupling package"
DESCRIPTION = "Tensorpac is an Python toolbox for computing Phase-Amplitude Coupling \
(PAC) using tensors and parallel computing."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python311-tensorpac-1.1-2.3.noarch.rpm"
RPM_HASH = "9319ffdf5a25bf51da78402e0992b311483ce99b779598ca1ca4b71f0179a86d692a478e8d54cedd9789399e2415f716d93f13f32bf4809fa12021063d71214c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tensorpac \
python311-tensorpac \
python3dist-tensorpac"

RDEPENDS:${PN} += "python-abi \
python311-joblib \
python311-numpy \
python311-scipy"

inherit rpm

SUMMARY = "Tensor-based phase-Amplitude coupling package"
DESCRIPTION = "Tensorpac is an Python toolbox for computing Phase-Amplitude Coupling \
(PAC) using tensors and parallel computing."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python311-tensorpac-1.1-2.5.noarch.rpm"
RPM_HASH = "4455ef341c24b0b4a5add2008233c8b397c2a17050785ea58ea4c6b4111ec46c9877cd0b3c8cfb355a84f3139b91d1dfb569982cfd0b613e00b64df1f9c5f9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tensorpac \
python3.11dist-tensorpac \
python311-tensorpac \
python3dist-tensorpac"

RDEPENDS:${PN} += "python-abi \
python311-joblib \
python311-numpy \
python311-scipy"

inherit rpm

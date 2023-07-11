SUMMARY = "A VCR imitation for python-requests"
DESCRIPTION = "Betamax is a VCR_ imitation for requests. This will make mocking out requests \
much easier."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python311-betamax-0.8.1-2.2.noarch.rpm"
RPM_HASH = "de22a8f721b843b74eb40fc15c3bd7437dd73269a89e8161a4484c877a8062c2f0b60421d02c5d9986ee862891dce157d1078089c9f64908b54e77feaed62135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-betamax \
python3.11dist-betamax \
python311-betamax \
python3dist-betamax"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm

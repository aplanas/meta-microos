SUMMARY = "hammett is a fast python test runner"
DESCRIPTION = "hammett is a fast python test runner"
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-hammett-0.5.0-1.19.noarch.rpm"
RPM_HASH = "fbd9642bee15617c50b909b3eee7766687c26d5b98f8d6edd218e3140573db9a3f808dc8ec72859862b91740c9ce1070a101e81468efb1802f91d9773cd93985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hammett \
python3.11dist-hammett \
python311-hammett \
python3dist-hammett"

RDEPENDS:${PN} += "python-abi \
python311-astunparse \
python311-colorama"

inherit rpm

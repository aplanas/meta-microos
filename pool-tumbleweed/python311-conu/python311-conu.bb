SUMMARY = "Python container testing library"
DESCRIPTION = "Python container testing library."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-conu-1.0.0-2.3.noarch.rpm"
RPM_HASH = "41f984fc37213d30e040d171afbf7021e7a8f70cf51a91edf61ed01f069eb24d5dd1730b1163b8111e0cc269ec5f9473ba8af86e35479d1e592405ddae1e74a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(conu) \
python311-conu \
python3dist(conu)"

RDEPENDS:${PN} += "python(abi) \
python311-docker \
python311-flexmock \
python311-kubernetes \
python311-pytest \
python311-requests"

inherit rpm

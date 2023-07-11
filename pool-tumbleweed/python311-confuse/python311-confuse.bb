SUMMARY = "Painless YAML configuration"
DESCRIPTION = "Painless YAML configuration."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-confuse-2.0.1-1.3.noarch.rpm"
RPM_HASH = "5421919cdf0aceeefdf4c999d94501c511d6ccba3188d300ddca22017bf11ea2b61c8728f98ebda4c716a34e197e4f0273158e2cbe087d117ca240dc1711aaa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-confuse \
python3.11dist-confuse \
python311-confuse \
python3dist-confuse"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML"

inherit rpm

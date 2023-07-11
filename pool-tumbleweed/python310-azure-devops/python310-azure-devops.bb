SUMMARY = "Python wrapper around the Azure DevOps 5x APIs"
DESCRIPTION = "Python wrapper around the Azure DevOps 5.x APIs"
LICENSE = "MIT"

PV = "7.1.0~b1"

RPM_NAME = "python310-azure-devops-7.1.0~b1-1.3.noarch.rpm"
RPM_HASH = "c718c54e853fb18adcbd3d41e85414259b7d8fc8e8bf1811c96a35e4fdedb80aed40f5f6b9daceb8334f6fb3f4a904cfda6e70f9410a8b38c6b9c8b0c119e69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-devops \
python310-azure-devops \
python310-vsts \
python3dist-azure-devops"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg \
python310-msrest"

inherit rpm

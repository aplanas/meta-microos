SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-attr-0.3.2-1.5.noarch.rpm"
RPM_HASH = "82ddc2fb00bd6f125e6f4afd7070ad1c3463ba8c0314e49d6a35fb8944d0e888ca59927eef2ec86c531e08e3f74a8cc532847d8f8e59e2e32b18fe4f7734dc10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-attr \
python310-attr \
python3dist-attr"

RDEPENDS:${PN} += "python-abi"

inherit rpm

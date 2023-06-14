SUMMARY = "ipdb/pdb statement checker plugin for flake8"
DESCRIPTION = "ipdb/pdb statement checker plugin for flake8"
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python311-flake8-debugger-4.1.2-1.3.noarch.rpm"
RPM_HASH = "322313f8a4c11d50383a5cff6881aaa36ea3169e08fa49522f4873c30038c1e4f81f7459f5b360b26bfb01dfbfb21dfb97bbca2b6997e42d85e72a9f93937ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flake8-debugger \
python311-flake8-debugger \
python3dist-flake8-debugger"

RDEPENDS:${PN} += "python-abi"

inherit rpm

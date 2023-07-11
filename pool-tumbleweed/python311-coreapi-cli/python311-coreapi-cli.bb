SUMMARY = "An interactive command line client for Core API"
DESCRIPTION = "An interactive command line client for Core API."
LICENSE = "BSD-2-Clause"

PV = "1.0.9"

RPM_NAME = "python311-coreapi-cli-1.0.9-1.24.noarch.rpm"
RPM_HASH = "76c151b6e473072cd9624bfb0969b5feeda4fad84a83af5dc9a1859caf3024367756d8e7a7e36f8a1afca7f44fcf694ff976cd9db11b3b3e564700e54f25886b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coreapi-cli \
python3.11dist-coreapi-cli \
python311-coreapi-cli \
python3dist-coreapi-cli"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-coreapi \
python311-coreschema \
python311-itypes \
python311-requests \
python311-uritemplate \
update-alternatives"

inherit rpm

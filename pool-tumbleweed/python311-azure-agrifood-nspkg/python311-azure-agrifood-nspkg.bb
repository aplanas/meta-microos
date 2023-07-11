SUMMARY = "Microsoft Azure AgriFood Namespace Package"
DESCRIPTION = "This is the Microsoft Azure AgriFood namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.agrifood namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-agrifood-nspkg-1.0.0-1.9.noarch.rpm"
RPM_HASH = "a7c3900be26d7b791d7ae47d81976abbdcca107730f5cf96c7e96af73b4dea0131b730cb2a68ab97eff826291e9db0c068eabbd3c4924e2a5c163fbecb9a3e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-agrifood-nspkg \
python3.11dist-azure-agrifood-nspkg \
python311-azure-agrifood-nspkg \
python3dist-azure-agrifood-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm

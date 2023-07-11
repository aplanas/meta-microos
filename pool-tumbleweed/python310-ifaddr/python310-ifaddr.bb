SUMMARY = "Module for enumerating IP addresses on system network adapters"
DESCRIPTION = "ifaddr is a Python library that allows finding the \
IP addresses assigned to the system."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-ifaddr-0.2.0-3.1.noarch.rpm"
RPM_HASH = "704d8fbdb4c46b46c0effe6974657bd568b913553f04e431d5414fa2a04310f8ef808bebadcdf702ba7c5de5d74ec31f64a21065674a1ef9dde8ec0682362a46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ifaddr \
python310-ifaddr \
python3dist-ifaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm

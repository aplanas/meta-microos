SUMMARY = "authres - Authentication Results Header Module"
DESCRIPTION = "authres - Authentication Results Header Module"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-authres-1.2.0-2.1.noarch.rpm"
RPM_HASH = "eeba2446f950a517890ad2a413fdf4688933475a61f3100d7ec3c282d97e36feb4f069e39285e6b29a49fec19554add9b5183207042a9e4106fb5868cd20bdb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-authres \
python310-authres \
python3dist-authres"

RDEPENDS:${PN} += "python-abi"

inherit rpm

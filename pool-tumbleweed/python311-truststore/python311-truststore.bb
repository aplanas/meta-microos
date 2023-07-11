SUMMARY = "Verify certificates using OS trust stores"
DESCRIPTION = "Verify certificates using OS trust stores. Supports macOS, \
Windows, and Linux (with OpenSSL). This project should be \
considered experimental."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-truststore-0.4.0-1.6.noarch.rpm"
RPM_HASH = "d2f2e3975ed4d290d0b85355ec2b0c808983eaa86c24513a34328044eff2e21d2505d377f3512c3929d62f673d8181f9303d8d8f3966edca8ba613af0e460eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-truststore \
python3.11dist-truststore \
python311-truststore \
python3dist-truststore"

RDEPENDS:${PN} += "python-abi"

inherit rpm

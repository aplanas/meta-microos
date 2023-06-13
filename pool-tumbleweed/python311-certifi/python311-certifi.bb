SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2023.5.7"

RPM_NAME = "python311-certifi-2023.5.7-1.1.noarch.rpm"
RPM_HASH = "8fa52e0002399623175e5012b9213351c48190813ad1dba64ef80cc0311cad15a3b923aecaa8ce1074d11c6488cd342be18af5aa9b8bbc219b3712ae9039bc09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certifi) \
python311-certifi \
python3dist(certifi)"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
python(abi)"

inherit rpm

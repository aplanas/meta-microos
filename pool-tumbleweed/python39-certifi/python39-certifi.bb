SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2023.5.7"

RPM_NAME = "python39-certifi-2023.5.7-1.2.noarch.rpm"
RPM_HASH = "a0a8c43e786896490728cfbbef05d59b717a19793a4a00c2bfacfb89567ff8b434dfa421a72c8ba4522def2cd0672606849b66e94b96552aef5d7ba5796ddb36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certifi \
python39-certifi \
python3dist-certifi"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
python-abi"

inherit rpm

SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, \
public keys, certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, \
PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-asn1crypto-1.5.1-3.1.noarch.rpm"
RPM_HASH = "ece3603eb09f50c39a90670053dbef46600a0c37d09fc1404fa56f7afbfabfbab381cd95077f3ea36487f41f759e467c7c2a9127fb318e343b54e254e66fe728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asn1crypto \
python3.10dist-asn1crypto \
python310-asn1crypto \
python3dist-asn1crypto"

RDEPENDS:${PN} += "python-abi"

inherit rpm

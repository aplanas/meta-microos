SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, \
public keys, certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, \
PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-asn1crypto-1.5.1-3.3.noarch.rpm"
RPM_HASH = "d871c4baaa65307489cc7807fa80df3112acbd9615c215f9c4e115b2cde04367f0b108ec111c05c7ea6c3d0bda7042133114653f7bfb49ab7b342288c6d7c409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asn1crypto \
python310-asn1crypto \
python3dist-asn1crypto"

RDEPENDS:${PN} += "python-abi"

inherit rpm

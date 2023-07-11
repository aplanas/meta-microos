SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, \
public keys, certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, \
PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-asn1crypto-1.5.1-3.3.noarch.rpm"
RPM_HASH = "a21f4f7b05d96a9e0d5ea8b833e7c08e172dce708de262a7a5126980cedb5b6b263f248f00c4876d98985d84c4be074b1bd1a77eb8684a8c36a5584696f7dafc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asn1crypto \
python39-asn1crypto \
python3dist-asn1crypto"

RDEPENDS:${PN} += "python-abi"

inherit rpm

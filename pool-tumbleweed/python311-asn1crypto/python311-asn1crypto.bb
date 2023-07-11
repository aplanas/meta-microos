SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, \
public keys, certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, \
PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-asn1crypto-1.5.1-3.3.noarch.rpm"
RPM_HASH = "cec1d8a2bd2b2342355612d0933c76f75eee35d4e84725003b4e35ccce352bb1563fea498e38c339d84e2533a9bae7950d9d1acfab4e97ebc0c6cf04ba967f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asn1crypto \
python3.11dist-asn1crypto \
python311-asn1crypto \
python3dist-asn1crypto"

RDEPENDS:${PN} += "python-abi"

inherit rpm

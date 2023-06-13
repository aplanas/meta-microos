SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, \
public keys, certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, \
PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-asn1crypto-1.5.1-3.1.noarch.rpm"
RPM_HASH = "5c9600dfe79fa0959264a2950dd2c3607cfdce30036b010f10a3afae9b977fb1178d0e18b1caefb6a25890894e8e202e62b4bd01f01fe0128d3f666faf8f4fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asn1crypto) \
python39-asn1crypto \
python3dist(asn1crypto)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

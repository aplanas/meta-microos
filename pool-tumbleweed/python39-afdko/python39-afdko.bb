SUMMARY = "Adobe Font Development Kit for OpenType"
DESCRIPTION = "Adobe Font Development Kit for OpenType"
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.3"

RPM_NAME = "python39-afdko-3.9.3-1.3.aarch64.rpm"
RPM_HASH = "04fa30065cec42084e6f917d528992126ecc8836fa5c457e3a3b0ab16dbf34f8af4e5083c6ee114a53ff9463df6c6e1814f27f2b5a18be503c05f1b78a91fc57"

RPROVIDES:${PN} += "adobe-afdko \
python3.9dist(afdko) \
python39-afdko \
python39-afdko(aarch-64) \
python3dist(afdko)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
python(abi) \
python39-Brotli \
python39-FontTools \
python39-booleanOperations \
python39-defcon \
python39-fontMath \
python39-fontPens \
python39-fs \
python39-lxml \
python39-mutatorMath \
python39-psautohint \
python39-tqdm \
python39-ufoProcessor \
python39-ufonormalizer \
python39-zopfli \
update-alternatives"

inherit rpm

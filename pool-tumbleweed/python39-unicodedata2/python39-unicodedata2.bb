SUMMARY = "Python unicodedata backport/updates"
DESCRIPTION = "Unicodedata backport and updates for the latest unicode version. \
The versions of this package match Unicode versions, so \
unicodedata2==15.0.0 is data from Unicode 15.0.0."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "15.0.0"

RPM_NAME = "python39-unicodedata2-15.0.0-1.6.aarch64.rpm"
RPM_HASH = "15857e6dbdd3ecae0bef570f5a70e5c61a71feada0ddf24c4a0f9b606c73d0360b670f38f8f4d079d81071e547596c4786c449f5850e13e24ffb5c885166763d"

RPROVIDES:${PN} += "python3.9dist-unicodedata2 \
python39-unicodedata2 \
python3dist-unicodedata2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

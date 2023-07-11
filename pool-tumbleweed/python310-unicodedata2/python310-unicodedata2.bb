SUMMARY = "Python unicodedata backport/updates"
DESCRIPTION = "Unicodedata backport and updates for the latest unicode version. \
The versions of this package match Unicode versions, so \
unicodedata2==15.0.0 is data from Unicode 15.0.0."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "15.0.0"

RPM_NAME = "python310-unicodedata2-15.0.0-1.6.aarch64.rpm"
RPM_HASH = "d1984ae5e9fdb3c71bc352c7821ccb339d0d104381bc1eb8fea05f54650e70a797154f1428e50bde83e5b4f583bfbd5b29fae991f9a99ee554d4b7529912d1ff"

RPROVIDES:${PN} += "python3.10dist-unicodedata2 \
python310-unicodedata2 \
python3dist-unicodedata2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

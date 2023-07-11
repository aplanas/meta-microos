SUMMARY = "Format a simple (i.e. not nested) list into aligned columns"
DESCRIPTION = "Format a simple (i.e. not nested) list into aligned columns."
LICENSE = "MIT"

PV = "0.3.11"

RPM_NAME = "python310-columnize-0.3.11-1.8.noarch.rpm"
RPM_HASH = "dbfdc233266fceae67e47842efb261d6d97c0159ae1da576d2eaaefb4b9641fa17930a5b8cfab44006442de547c073955f42443c6a5f1f5e762bd130284e1691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-columnize \
python310-columnize \
python3dist-columnize"

RDEPENDS:${PN} += "python-abi"

inherit rpm

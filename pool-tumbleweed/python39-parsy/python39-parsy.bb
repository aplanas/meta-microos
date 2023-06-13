SUMMARY = "Python parser combinators"
DESCRIPTION = "Easy-to-use parser combinators, for parsing in pure Python."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-parsy-1.3.0-1.8.noarch.rpm"
RPM_HASH = "7fb99aababf0ccc16389db8e12de907d0829f75496d673a6873753980805cc4c6c07946e6d0a43851ee5e85f4a69909167051cded0622bd92c27a215d35e8a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parsy) \
python39-parsy \
python3dist(parsy)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

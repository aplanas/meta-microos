SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python310-manuel-1.12.4-4.1.noarch.rpm"
RPM_HASH = "617e6242a0a336ff8bf72e94aaac8aba1e727829fdebfbe644abd7756661108f89c81e4df3f0f50d854cb905332a784450f75e94224ab2527241205e2b30a564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manuel \
python3.10dist(manuel) \
python310-manuel \
python3dist(manuel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

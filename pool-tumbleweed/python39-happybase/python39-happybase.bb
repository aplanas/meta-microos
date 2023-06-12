SUMMARY = "A Python library to interact with Apache HBase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-happybase-1.2.0-3.7.noarch.rpm"
RPM_HASH = "a0eba0b3c296243fb4c0e1e688ba96e57a995199e626772aaafe7d3f3563c8c9112c978208f772267f99bf2025bbc068d49822b9c2c58689d017d6ce3624025e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(happybase) \
python39-happybase \
python3dist(happybase)"
RDEPENDS:${PN} += "python(abi) \
python39-six \
python39-thriftpy2"

inherit rpm

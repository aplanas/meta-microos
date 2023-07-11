SUMMARY = "A graphical models library for Python"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python310-pomegranate-0.12.0-2.15.aarch64.rpm"
RPM_HASH = "d295381a7cbb96209a7efeb9d84d7a11459d88cef08032bc46a451402cd52d6af4dd41fae9d3509417e70abc4a515a49c626af879c9850058334868700dea571"

RPROVIDES:${PN} += "python3.10dist-pomegranate \
python310-pomegranate \
python3dist-pomegranate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-PyYAML \
python310-joblib \
python310-networkx \
python310-numpy \
python310-scipy"

inherit rpm

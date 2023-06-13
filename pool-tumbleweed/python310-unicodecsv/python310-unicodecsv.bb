SUMMARY = "Drop-in replacment for python's csv module with unicode support"
DESCRIPTION = "Python 2's csv module doesn't easily deal with unicode strings, \
leading to the dreaded ''ascii' codec can't encode characters \
in position ...' exception. \
 \
The unicodecsv is a drop-in replacement for Python 2's csv module \
which supports unicode strings without a hassle."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "python310-unicodecsv-0.14.1-2.19.noarch.rpm"
RPM_HASH = "f0b068116e6fe624431f7a68dcddd55e8afa80728a185d0d68ccc897b972e731b26dc0aa43a15f0229e652d6143ed9a87aacf355632d4dcce22d29cf563555e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unicodecsv \
python3.10dist(unicodecsv) \
python310-unicodecsv \
python3dist(unicodecsv)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

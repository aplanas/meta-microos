SUMMARY = "Python wrapper around argparse, a tool to create CLI apps"
DESCRIPTION = "Mando is a wrapper around argparse, and allows writing CLI \
applications."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-mando-0.7.1-1.6.noarch.rpm"
RPM_HASH = "9c97374fba4e8f15205eba40490d580da8952e0314027ca9546ba27742c29da3a968eb0a9721975fd019b936d6acfdd68fbe0f289b4f96186674c4339dee06b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mando) \
python39-mando \
python3dist(mando)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm

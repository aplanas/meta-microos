SUMMARY = "Python dependency file parser"
DESCRIPTION = "A parser for Python dependency files."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python310-dparse-0.6.3-1.1.noarch.rpm"
RPM_HASH = "8ab2c17d00e540d42e452fe6c9a90f6ef4035e6a61249cc7e1c8a878bbbfb9c0f89315f67da99f5b681b76998b0441274467da1558f52dfa25cf48d4ba791f7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dparse \
python310-dparse \
python3dist-dparse"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-packaging"

inherit rpm

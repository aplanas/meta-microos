SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-charset-normalizer-3.1.0-2.3.noarch.rpm"
RPM_HASH = "2ae4d0a0339028dfb336b35bfbd55a3be6f928b3b8d0c8464e9b07327ec265ace17b5ce6ebebe9ed374d426a212bd712e4e418c4b8680521f8410ad113c66446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-charset-normalizer \
python39-charset-normalizer \
python3dist-charset-normalizer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

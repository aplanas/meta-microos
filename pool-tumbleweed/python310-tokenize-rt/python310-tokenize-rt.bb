SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python310-tokenize-rt-5.1.0-1.1.noarch.rpm"
RPM_HASH = "0a13a033780b83b60d5931058802d7a07b52b3f3436d7ed202f33f15add0c35766362cdf5411e704e32e5b38cf1357389cbdf275315b78905966df5337e73ff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tokenize-rt \
python310-tokenize-rt \
python3dist-tokenize-rt"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

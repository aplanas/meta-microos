SUMMARY = "An automated checker to make sure a C++ file follows Google's C++ style guide"
DESCRIPTION = "This project continues the work of cpplint, a C++ style checker \
following Google's C++ style guide. It provides cpplint as a PyPI \
package and adds a few features and fixes. It is maintained as a \
fork of google/styleguide (https://github.com/google/styleguide) \
in hopes that it can be merged in the future."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python39-cpplint-1.6.1-1.1.noarch.rpm"
RPM_HASH = "7a91ea9c1e4c1d968b10797acb9429a0673686e9e8fdb2797866c0a1cc5639afa2c194469d131d2cf84ed5218677d401f07de79fe1914079e2913eb4f0c77673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cpplint \
python39-cpplint \
python3dist-cpplint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

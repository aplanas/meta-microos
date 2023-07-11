SUMMARY = "An automated checker to make sure a C++ file follows Google's C++ style guide"
DESCRIPTION = "This project continues the work of cpplint, a C++ style checker \
following Google's C++ style guide. It provides cpplint as a PyPI \
package and adds a few features and fixes. It is maintained as a \
fork of google/styleguide (https://github.com/google/styleguide) \
in hopes that it can be merged in the future."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python311-cpplint-1.6.1-1.3.noarch.rpm"
RPM_HASH = "cdb36eab6406316486f4130c22ea66af8a5f31314ebdfab694fd953e86effaa1e78c420366169b7b0e4af121c2c198af5f4278920b6132734514c26dc11f1e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cpplint \
python3.11dist-cpplint \
python311-cpplint \
python3dist-cpplint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

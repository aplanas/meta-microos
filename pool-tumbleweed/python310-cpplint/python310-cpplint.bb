SUMMARY = "An automated checker to make sure a C++ file follows Google's C++ style guide"
DESCRIPTION = "This project continues the work of cpplint, a C++ style checker \
following Google's C++ style guide. It provides cpplint as a PyPI \
package and adds a few features and fixes. It is maintained as a \
fork of google/styleguide (https://github.com/google/styleguide) \
in hopes that it can be merged in the future."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python310-cpplint-1.6.1-1.3.noarch.rpm"
RPM_HASH = "a207f46339f6e7593a2485da25bba3a51dfca754ea3c5bea86962fb2fe23fb1364893c708f3e77f774a5a051020d12d9f8b88623d6cd7d32ebf1c5cb57fb0f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cpplint \
python310-cpplint \
python3dist-cpplint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

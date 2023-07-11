SUMMARY = "An automated checker to make sure a C++ file follows Google's C++ style guide"
DESCRIPTION = "This project continues the work of cpplint, a C++ style checker \
following Google's C++ style guide. It provides cpplint as a PyPI \
package and adds a few features and fixes. It is maintained as a \
fork of google/styleguide (https://github.com/google/styleguide) \
in hopes that it can be merged in the future."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python39-cpplint-1.6.1-1.3.noarch.rpm"
RPM_HASH = "956d47de4bd5c48614f6f482d0df6dd0a928231be28bd2d5dd99788b0595b56169566cea45dea71bf3508ca9b5de67d81354decf91f078cee080cc66f5af4a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cpplint \
python39-cpplint \
python3dist-cpplint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

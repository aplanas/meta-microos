SUMMARY = "Python wrapper for the Twitter API"
DESCRIPTION = "Twython is a Python library providing a way to access Twitter data. \
 \
Features include: \
 \
- Query data for: \
    - User information \
    - Twitter lists \
    - Timelines \
    - Direct Messages \
    - and anything found in `the docs <https://dev.twitter.com/docs/api/1.1>`_ \
- Image Uploading: \
    - Update user status with an image \
    - Change user avatar \
    - Change user background image \
    - Change user banner image \
- OAuth 2 Application Only (read-only) Support \
- Support for Twitter's Streaming API \
- Seamless Python 3 support!"
LICENSE = "MIT"

PV = "3.9.1"

RPM_NAME = "python39-twython-3.9.1-1.3.noarch.rpm"
RPM_HASH = "6896a04e796bbfc53c25f3a50839689e76bdaff7d9bff240e8486a82e40281fc35bcdc966119c5f19b8fd42565b2e3c5055cb3d6378ed77f9125230e222dfeb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-twython \
python39-twython \
python3dist-twython"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-requests-oauthlib"

inherit rpm

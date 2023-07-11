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

RPM_NAME = "python39-twython-3.9.1-1.5.noarch.rpm"
RPM_HASH = "cbeeb56e015f398813a965d722c1e7d0170966a177479f71dfa8d04d75dcc9f7a9b742cb9e678f22b9066fe927c733b8dca9585bb15c64b9451879873658f8af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-twython \
python39-twython \
python3dist-twython"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-requests-oauthlib"

inherit rpm

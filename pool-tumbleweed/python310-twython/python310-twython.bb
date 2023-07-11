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

RPM_NAME = "python310-twython-3.9.1-1.5.noarch.rpm"
RPM_HASH = "64c5ee2bfa6b23c339c547aedc434c5df47da20011e47ee9e3c2eb2324b0a86e7b448c1863afd3c16662f56a5b1287b294622559060ecc389d01505a6aa9fe4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-twython \
python310-twython \
python3dist-twython"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-requests-oauthlib"

inherit rpm

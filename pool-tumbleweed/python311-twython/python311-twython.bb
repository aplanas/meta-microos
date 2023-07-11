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

RPM_NAME = "python311-twython-3.9.1-1.5.noarch.rpm"
RPM_HASH = "9019aced4e4db7c65300fb91076a254116a5d68744fdd1cebe5725256ffa40e8ee78d72b75855c8c02a06366ba8ab20c81625ccefb026075ad055c379acdc80b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-twython \
python3.11dist-twython \
python311-twython \
python3dist-twython"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-requests-oauthlib"

inherit rpm

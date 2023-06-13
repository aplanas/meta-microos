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

RPM_NAME = "python310-twython-3.9.1-1.3.noarch.rpm"
RPM_HASH = "ff7b3c5a1853f049d526183b56e00d327f7f5e59c13c962da8a27752f5d453a39d680f66c1c62b28cfb29fc4af13932d5917ca144abf6307a7fbbf9bb3f1cd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-twython \
python3.10dist(twython) \
python310-twython \
python3dist(twython)"

RDEPENDS:${PN} += "python(abi) \
python310-requests \
python310-requests-oauthlib"

inherit rpm

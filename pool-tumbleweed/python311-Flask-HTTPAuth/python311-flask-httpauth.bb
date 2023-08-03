SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.8.0"

RPM_NAME = "python311-Flask-HTTPAuth-4.8.0-1.1.noarch.rpm"
RPM_HASH = "c54997fb8a7a16657e2b309d343c9ddb611aaea11266cddb0b4a6baa8a86b3f8c2303a26246d28442864f479f1dded9bec899b563640dd8b7a41fc96c5c0e548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-HTTPAuth \
python3.11dist-flask-httpauth \
python311-Flask-HTTPAuth \
python3dist-flask-httpauth"

RDEPENDS:${PN} += "python-abi \
python311-Flask"

inherit rpm

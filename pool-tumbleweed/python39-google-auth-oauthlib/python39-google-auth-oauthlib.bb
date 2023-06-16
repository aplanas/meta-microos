SUMMARY = "Google authentication library"
DESCRIPTION = "This library provides oauthlib integration with google-auth."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-google-auth-oauthlib-1.0.0-2.2.noarch.rpm"
RPM_HASH = "00c7acf78b847a57e4dbccb93a799d66b2a40891803899326fb0e662886483ea8bec6d069c77eab23b2c26bd1f42e3236e270cbdb95f2b7f9cef68d6eef8c90c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-auth-oauthlib \
python39-google-auth-oauthlib \
python3dist-google-auth-oauthlib"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-google-auth \
python39-requests-oauthlib \
update-alternatives"

inherit rpm

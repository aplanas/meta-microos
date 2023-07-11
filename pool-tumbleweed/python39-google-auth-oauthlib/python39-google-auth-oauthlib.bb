SUMMARY = "Google authentication library"
DESCRIPTION = "This library provides oauthlib integration with google-auth."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-google-auth-oauthlib-1.0.0-3.1.noarch.rpm"
RPM_HASH = "ea8a42e2ae3dd7eae8a58628bb9db7a934943ef81d16b4d6dbba1abefdae2b6ecbca202edaf1707122743f5a9645a14ddfefc63262cef4c3b35e6716752cc923"
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

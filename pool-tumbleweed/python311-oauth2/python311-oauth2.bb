SUMMARY = "A fully tested, abstract interface to creating OAuth clients and servers"
DESCRIPTION = "This code was originally forked from Leah Culver and Andy Smith's oauth.py code. \
Some of the tests come from a fork by Vic Fryzel, while a revamped Request \
class and more tests were merged in from Mark Paschal's fork. After a hiatus \
the project was taken over by Daniel Holmes the current maintainer"
LICENSE = "MIT"

PV = "1.9.0.post1"

RPM_NAME = "python311-oauth2-1.9.0.post1-5.7.noarch.rpm"
RPM_HASH = "9552eb4bcda7f0e598f32b2d1b95fe9c069230f26e3cb41af6366bed54408496233dcd39a6767a798a374d71d1ca9c953b9d30cf3ba978e3472c612fb3111c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oauth2 \
python3.11dist-oauth2 \
python311-oauth2 \
python3dist-oauth2"

RDEPENDS:${PN} += "python-abi \
python311-httplib2"

inherit rpm

SUMMARY = "A fully tested, abstract interface to creating OAuth clients and servers"
DESCRIPTION = "This code was originally forked from Leah Culver and Andy Smith's oauth.py code. \
Some of the tests come from a fork by Vic Fryzel, while a revamped Request \
class and more tests were merged in from Mark Paschal's fork. After a hiatus \
the project was taken over by Daniel Holmes the current maintainer"
LICENSE = "MIT"

PV = "1.9.0.post1"

RPM_NAME = "python310-oauth2-1.9.0.post1-5.5.noarch.rpm"
RPM_HASH = "e38723bb3fd9db14e9c3a7376897474a81f78926840d537d41a779de9564b4f6c2cb87ed7e1e54a19a50f0b9671ed92da599ca8528101faf35b3bdd5d257ff80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oauth2 \
python3.10dist(oauth2) \
python310-oauth2 \
python3dist(oauth2)"

RDEPENDS:${PN} += "python(abi) \
python310-httplib2"

inherit rpm

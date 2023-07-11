SUMMARY = "A fully tested, abstract interface to creating OAuth clients and servers"
DESCRIPTION = "This code was originally forked from Leah Culver and Andy Smith's oauth.py code. \
Some of the tests come from a fork by Vic Fryzel, while a revamped Request \
class and more tests were merged in from Mark Paschal's fork. After a hiatus \
the project was taken over by Daniel Holmes the current maintainer"
LICENSE = "MIT"

PV = "1.9.0.post1"

RPM_NAME = "python310-oauth2-1.9.0.post1-5.7.noarch.rpm"
RPM_HASH = "b2b5f0e33c0ec3330fb2b5aaa049eefb267a3a49407c6760da62b481e81a92002f1dec46b3fec442d9da08b6493d2c5443e966c781550b0c9e3d514c088c51de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-oauth2 \
python310-oauth2 \
python3dist-oauth2"

RDEPENDS:${PN} += "python-abi \
python310-httplib2"

inherit rpm

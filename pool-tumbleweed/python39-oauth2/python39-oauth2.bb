SUMMARY = "A fully tested, abstract interface to creating OAuth clients and servers"
DESCRIPTION = "This code was originally forked from Leah Culver and Andy Smith's oauth.py code. \
Some of the tests come from a fork by Vic Fryzel, while a revamped Request \
class and more tests were merged in from Mark Paschal's fork. After a hiatus \
the project was taken over by Daniel Holmes the current maintainer"
LICENSE = "MIT"

PV = "1.9.0.post1"

RPM_NAME = "python39-oauth2-1.9.0.post1-5.7.noarch.rpm"
RPM_HASH = "d774d577697891669183c2e7de5554343cd186222b9eef306ca7e1a0a9e95de345e8728bf58fcf4c1730209893105481056a26892240e854aaa069d4692793ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oauth2 \
python39-oauth2 \
python3dist-oauth2"

RDEPENDS:${PN} += "python-abi \
python39-httplib2"

inherit rpm

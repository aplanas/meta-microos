SUMMARY = "Flask extension providing simple email sending capabilities"
DESCRIPTION = "Flask-Mailman is a Flask extension providing simple email sending capabilities. \
 \
It was meant to replace unmaintained Flask-Mail with a better warranty and \
more features."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python310-Flask-Mailman-0.3.0-2.1.noarch.rpm"
RPM_HASH = "d0d1b36191ecbd7152ed46ff9032c4aa63f58a29d27d2972f323bbcf21bae77f734124b584bf2bd7d44976b0d1fd92722bb87c401bc42b115f6101bddf99b709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Mailman \
python3.10dist-flask-mailman \
python310-Flask-Mailman \
python3dist-flask-mailman"

RDEPENDS:${PN} += "python-abi \
python310-Flask"

inherit rpm

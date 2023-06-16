SUMMARY = "A pyunit extension to output JUnit compatible XML"
DESCRIPTION = "A Python unittest TestResult that outputs JUnit compatible XML."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "python311-junitxml-0.7-4.7.noarch.rpm"
RPM_HASH = "149e9512895ae83392eb59b6632b40cf5463075972b4ff5bfdc40f48bf8b7b10393bfbdf6353958c52894e05cc9292e773c0529b8685f98aace258f007d62244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-junitxml \
python311-junitxml \
python3dist-junitxml"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm

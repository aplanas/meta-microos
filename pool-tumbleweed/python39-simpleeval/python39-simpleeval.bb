SUMMARY = "A simple, safe single expression evaluator library"
DESCRIPTION = "A quick single file library for easily adding evaluatable expressions \
into python projects. Say you want to allow a user to set an alarm volume, \
which could depend on the time of day, alarm level, how many previous alarms \
had gone off, and if there is music playing at the time. \
 \
Or if you want to allow simple formulare in a web application, but don’t want \
to give full eval() access, or don’t want to run in javascript on the client side."
LICENSE = "MIT"

PV = "0.9.12"

RPM_NAME = "python39-simpleeval-0.9.12-1.9.noarch.rpm"
RPM_HASH = "1ae63c97537934fd477e6531044c929619028bd766a9573518794617972834d464448e8c1dc13d11fd2251c2ed3b4a8148dec202fc28aad754d6a858c8f14963"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-simpleeval \
python39-simpleeval \
python3dist-simpleeval"

RDEPENDS:${PN} += "python-abi"

inherit rpm

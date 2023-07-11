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

RPM_NAME = "python310-simpleeval-0.9.12-1.9.noarch.rpm"
RPM_HASH = "1df755b3cbad35ae6eee71c85abab816dfb3af7722fa9c1f18f31ca40090793070060e884efc9135a3571864bae9f4e552aa6d108830eb14c102226ccadadbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-simpleeval \
python310-simpleeval \
python3dist-simpleeval"

RDEPENDS:${PN} += "python-abi"

inherit rpm

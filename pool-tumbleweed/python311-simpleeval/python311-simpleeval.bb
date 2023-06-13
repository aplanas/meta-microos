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

RPM_NAME = "python311-simpleeval-0.9.12-1.7.noarch.rpm"
RPM_HASH = "290888f426d34edd6a504e85f07a2b7f3088ad5aaeb619d85475028cb291c2767bcbe3390daf09e6c41b95baeb596c23e21c388d602ea35d79bed638166e43fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(simpleeval) \
python311-simpleeval \
python3dist(simpleeval)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

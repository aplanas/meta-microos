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

RPM_NAME = "python311-simpleeval-0.9.12-1.9.noarch.rpm"
RPM_HASH = "79e0aad7515a64b74c675a9f0749c95b794e32a7253fd5a8461fd4f124dbfc45b1b10b38efaa11fe8c40dfa82bcb179c7e39b26eb5cb36225f3a86102d25e12f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simpleeval \
python3.11dist-simpleeval \
python311-simpleeval \
python3dist-simpleeval"

RDEPENDS:${PN} += "python-abi"

inherit rpm

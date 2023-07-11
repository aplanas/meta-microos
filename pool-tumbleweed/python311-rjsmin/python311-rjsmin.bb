SUMMARY = "A JavaScript minifier written in Python"
DESCRIPTION = "rJSmin is a Javascript minifier written in Python. \
 \
The minifier is based on the semantics of jsmin.c by Douglas Crockford. \
 \
The module is a re-implementation targeting speed, so it can be used \
at runtime (rather than during a preprocessing step)."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python311-rjsmin-1.2.1-2.1.aarch64.rpm"
RPM_HASH = "997a949a3f2a184dfccea4048257ba0137044ff0386fe1617a5582d17019bf576a2f89efaac981a716213ca541619c5a95b1404faefb12fdabe7481d628d75a4"

RPROVIDES:${PN} += "python3-rjsmin \
python3.11dist-rjsmin \
python311-rjsmin \
python3dist-rjsmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

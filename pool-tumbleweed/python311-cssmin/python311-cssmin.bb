SUMMARY = "YUI CSS compression algorithm"
DESCRIPTION = "This is a Python port of the YUI CSS Compressor."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.2.0"

RPM_NAME = "python311-cssmin-0.2.0-1.6.noarch.rpm"
RPM_HASH = "97a2dbbafd77085eab28150e910f6dab606da1b8f80b6588b6756b77bbf43edbab496fde41fe9475b8470dce80e03c3c30390bac7a1faaab1f408cc76b694033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssmin \
python3.11dist-cssmin \
python311-cssmin \
python3dist-cssmin"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

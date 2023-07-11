SUMMARY = "Implements a lazy string for python useful for use with gettext"
DESCRIPTION = "A module that provides lazy strings for translations.  Basically you \
get an object that appears to be a string but changes the value every \
time the value is evaluated based on a callable you provide."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "python311-speaklater-1.3-2.16.noarch.rpm"
RPM_HASH = "fd8698d7460ad23bde21cdb95606239e7fbb54d4c0f9d3db1e659666c4ee7e34d6d5b251fd76dbb413d7fc85b6edc89c57d3b55eef2c8c41419ed10f248ae5f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-speaklater \
python3.11dist-speaklater \
python311-speaklater \
python3dist-speaklater"

RDEPENDS:${PN} += "python-abi"

inherit rpm

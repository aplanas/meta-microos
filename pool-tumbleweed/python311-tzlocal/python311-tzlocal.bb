SUMMARY = "tzinfo object for the local timezone"
DESCRIPTION = "This Python module returns a tzinfo object with the local timezone information \
under Unix and Win-32. It requires pytz, and returns pytz tzinfo objects. \
 \
This module attempts to fix a glaring hole in pytz, that there is no way to get \
the local timezone information, unless you know the zoneinfo name, and under \
several Linux distros that’s hard or impossible to figure out. \
 \
Also, with Windows different timezone system using pytz isn’t of much use unless \
you separately configure the zoneinfo timezone name. \
 \
With tzlocal you only need to call get_localzone() and you will get a tzinfo \
object with the local time zone info. On some Unices you will still not get to \
know what the timezone name is, but you don’t need that when you have the tzinfo \
file. However, if the timezone name is readily available it will be used."
LICENSE = "MIT"

PV = "4.3"

RPM_NAME = "python311-tzlocal-4.3-1.3.noarch.rpm"
RPM_HASH = "d300a1b4b80f5b677cf9d5a9612b9213cec01d7e62639dc2ad2b021c5f695c656117a6f512fde4910bfaadbc9b9f137acd76b997bc80211fb4eba740b9253e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tzlocal \
python3.11dist-tzlocal \
python311-tzlocal \
python3dist-tzlocal"

RDEPENDS:${PN} += "python-abi \
python311-pytz \
python311-pytz-deprecation-shim"

inherit rpm

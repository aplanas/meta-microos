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

RPM_NAME = "python39-tzlocal-4.3-1.3.noarch.rpm"
RPM_HASH = "e4c900ef5831769c44acdb73528d3f22c7d444581b91426886e0d221b6bb46a0cb36c11cf6c3420e33e7a1e3145f025d7e97f636d9297abd18b3c3820ead6272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tzlocal \
python39-tzlocal \
python3dist-tzlocal"

RDEPENDS:${PN} += "python-abi \
python39-pytz \
python39-pytz-deprecation-shim"

inherit rpm

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

RPM_NAME = "python310-tzlocal-4.3-1.1.noarch.rpm"
RPM_HASH = "a34aab1712047a9921abc474164153457c5b00a26e08e3ca124deafcdb093e1e6a3cfa7698003c11b7976bb581eff2eef677a71ddc293fa458f51a52fd1b809e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tzlocal \
python3.10dist-tzlocal \
python310-tzlocal \
python3dist-tzlocal"

RDEPENDS:${PN} += "python-abi \
python310-pytz \
python310-pytz-deprecation-shim"

inherit rpm

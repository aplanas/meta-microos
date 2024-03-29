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

RPM_NAME = "python310-tzlocal-4.3-1.3.noarch.rpm"
RPM_HASH = "878ee248fbf6df0c838f6c0475be0626bfe8e5162c761c0e7ef913b6b3b3902d65771737d7b87db18c0b03a11e3a0966997309e313513adb46ebd4b36c7777e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tzlocal \
python310-tzlocal \
python3dist-tzlocal"

RDEPENDS:${PN} += "python-abi \
python310-pytz \
python310-pytz-deprecation-shim"

inherit rpm

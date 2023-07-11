SUMMARY = "A sophisticated calendar and alarm program"
DESCRIPTION = "Remind is a sophisticated calendar and alarm program. \
It includes the following features: \
 \
* A sophisticated scripting language and intelligent \
  handling of exceptions and holidays. \
* Plain-text, PostScript and HTML output. \
* Timed reminders and pop-up alarms. \
* A friendly graphical front-end for people who don't \
  want to learn the scripting language. \
* Facilities for both the Gregorian and Hebrew calendars. \
* Support for 12 different languages."
LICENSE = "GPL-2.0-only"

PV = "4.2.5"

RPM_NAME = "remind-4.2.5-1.2.aarch64.rpm"
RPM_HASH = "fda8fb9eaf81721210cd4886550915e2b5295b2023cf3bcf4dfb9a1c0a903a1cdb2ee7e5296fcb35c479517f4d4d309f43a78f4d728d5ef05828d345d07fca35"

RPROVIDES:${PN} += "perl-Remind--PDF \
perl-Remind--PDF--Entry \
perl-Remind--PDF--Entry--UNKNOWN \
perl-Remind--PDF--Entry--color \
perl-Remind--PDF--Entry--html \
perl-Remind--PDF--Entry--htmlclass \
perl-Remind--PDF--Entry--moon \
perl-Remind--PDF--Entry--pango \
perl-Remind--PDF--Entry--postscript \
perl-Remind--PDF--Entry--psfile \
perl-Remind--PDF--Entry--shade \
perl-Remind--PDF--Entry--week \
perl-Remind--PDF--Multi \
remind"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
perl \
perl-Cairo \
perl-Getopt-Long-Descriptive \
perl-JSON-Any \
perl-Pango \
tcllib"

inherit rpm

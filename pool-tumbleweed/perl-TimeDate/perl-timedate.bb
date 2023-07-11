SUMMARY = "TimeDate Perl module"
DESCRIPTION = "Date::Parse provides two routines for parsing date strings into time values. \
 \
str2time(DATE [, ZONE]) \
 \
   str2time parses DATE and returns a unix time value, or undef upon failure. \
    ZONE, if given, specifies the timezone to assume when parsing if the date \
    string does not specify a timezome. \
 \
strptime(DATE [, ZONE]) \
 \
   strptime takes the same arguments as str2time but returns an array of values \
    ($ss,$mm,$hh,$day,$month,$year,$zone). Elements are only defined if they \
    could be extracted from the date string. The $zone element is the timezone \
    offset in seconds from GMT. An empty array is returned upon failure."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.33"

RPM_NAME = "perl-TimeDate-2.33-1.14.noarch.rpm"
RPM_HASH = "ac174bd371d377986a0b519ad4f1c59715c04f2aae09e1928341eb96fd90c0375b8c0c968b4d53616acf8ae4910f2b432a0f94b9c4977ca4a362342838591249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Format \
perl-Date--Format--Generic \
perl-Date--Language \
perl-Date--Language--Afar \
perl-Date--Language--Amharic \
perl-Date--Language--Austrian \
perl-Date--Language--Brazilian \
perl-Date--Language--Bulgarian \
perl-Date--Language--Chinese \
perl-Date--Language--Chinese-GB \
perl-Date--Language--Czech \
perl-Date--Language--Danish \
perl-Date--Language--Dutch \
perl-Date--Language--English \
perl-Date--Language--Finnish \
perl-Date--Language--French \
perl-Date--Language--Gedeo \
perl-Date--Language--German \
perl-Date--Language--Greek \
perl-Date--Language--Hungarian \
perl-Date--Language--Icelandic \
perl-Date--Language--Italian \
perl-Date--Language--Norwegian \
perl-Date--Language--Occitan \
perl-Date--Language--Oromo \
perl-Date--Language--Romanian \
perl-Date--Language--Russian \
perl-Date--Language--Russian-cp1251 \
perl-Date--Language--Russian-koi8r \
perl-Date--Language--Sidama \
perl-Date--Language--Somali \
perl-Date--Language--Spanish \
perl-Date--Language--Swedish \
perl-Date--Language--Tigrinya \
perl-Date--Language--TigrinyaEritrean \
perl-Date--Language--TigrinyaEthiopian \
perl-Date--Language--Turkish \
perl-Date--Parse \
perl-Time--Zone \
perl-TimeDate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

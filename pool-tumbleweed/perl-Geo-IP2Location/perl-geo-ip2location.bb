SUMMARY = "Lookup of country, region, city, latitude, longitude, ZIP code, time zon[cut]"
DESCRIPTION = "This Perl module provides fast lookup of country, region, city, latitude, \
longitude, ZIP code, time zone, ISP, domain name, connection type, IDD \
code, area code, weather station code and station, MCC, MNC, mobile carrier \
brand, elevation, usage type, IP address type, IAB advertising category, \
district, AS number and AS name from IP address using IP2Location database. \
This module uses a file based BIN database available at at \
https://www.ip2location.com/database/ip2location upon subscription. You can \
visit at https://www.ip2location.com/development-libraries to download BIN \
sample files. This database consists of IP address as keys and other \
information as values. It supports all IP addresses in IPv4 and IPv6. \
 \
This module can be used in many types of project such as: \
 \
 1) auto-select the geographically closest mirror server \
 2) analyze web server logs to determine the countries of visitors \
 3) credit card fraud detection \
 4) software export controls \
 5) display native language and currency \
 6) prevent password sharing and abuse of service \
 7) geotargeting in advertisement"
LICENSE = "MIT"

PV = "8.70"

RPM_NAME = "perl-Geo-IP2Location-8.70-1.2.noarch.rpm"
RPM_HASH = "7cf342e4d9b3e81f15cb5b8081055fc7349a1583d3cdd274ec3eec92bab56a4b83dd1438eec890bd2d7ceb1a84cea0c85d8e388b3fa141619550f90517460f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Geo--IP2Location \
perl-Geo-IP2Location"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

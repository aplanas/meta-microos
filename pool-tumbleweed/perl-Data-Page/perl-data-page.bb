SUMMARY = "Help when paging through sets of results"
DESCRIPTION = "When searching through large amounts of data, it is often the case that a \
result set is returned that is larger than we want to display on one page. \
This results in wanting to page through various pages of data. The maths \
behind this is unfortunately fiddly, hence this module. \
 \
The main concept is that you pass in the number of total entries, the \
number of entries per page, and the current page number. You can then call \
methods to find out how many pages of information there are, and what \
number the first and last entries on the current page really are. \
 \
For example, say we wished to page through the integers from 1 to 100 with \
20 entries per page. The first page would consist of 1-20, the second page \
from 21-40, the third page from 41-60, the fourth page from 61-80 and the \
fifth page from 81-100. This module would help you work this out."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.03"

RPM_NAME = "perl-Data-Page-2.03-1.17.noarch.rpm"
RPM_HASH = "136ac156c69c001ee309024a7c7a63c20b2cd30c1680fc29dabf458ee3243001eeb5b9aa809b2bdc79bc1284f09774d3ba3138f569a067c66b451d0ddd7169ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Page \
perl-Data-Page"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor--Chained--Fast"

inherit rpm

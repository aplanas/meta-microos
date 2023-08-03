SUMMARY = "Data pack for Business::ISBN"
DESCRIPTION = "You don't need to load this module yourself in most cases. Business::ISBN \
will load it when it loads. You must use Business::ISBN 3.005 or later \
because the data structure changed slightly to fix a bug with ISBN13 \
prefixes. \
 \
These data are generated from the _RangeMessage.xml_ file provided by the \
ISBN Agency. The distributed version matches the date in the version for \
this module. You can retrieve this yourself at \
https://www.isbn-international.org/range_file_generation. This file is \
included as part of the distribution and should be installed at \
_~lib/Business/ISBN/Data/RangeMessage.xml_. \
 \
If you want to use a different _RangeMessage.xml_ file, you can set the \
'ISBN_RANGE_MESSAGE' environment variable to the alternate location before \
you load 'Business::ISBN'. This way, you can use the latest (or even \
earlier) data without having to install something new or wait for an update \
to this module. \
 \
If the default _RangeMessage.xml_ or your alternate one is not available, \
the module falls back to data included in _Data.pm_. However, that data are \
likely to be older. If it does not find that file, it looks for \
_RangeMessage.xml_ in the current directory. \
 \
The data are in '%Business::ISBN::country_data' (although the 'country' \
part is historical). If you want to see where the data are from, check \
'$Business::ISBN::country_data{_source}'."
LICENSE = "Artistic-2.0"

PV = "20230719.1.0"

RPM_NAME = "perl-Business-ISBN-Data-20230719.1.0-1.1.noarch.rpm"
RPM_HASH = "4674313da41d9bf3987aa7783453ac02c6504f1448b33d9808bd268e8d6591d9e14b3dcc10affd95c4f59ea3b9c2a418252f99a5ff29a5b89de945c51622f5b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISBN--Data \
perl-Business-ISBN-Data"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

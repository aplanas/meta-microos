SUMMARY = "Class providing URI query string manipulation"
DESCRIPTION = "URI::Query provides simple URI query string manipulation, allowing you to \
create and manipulate URI query strings from GET and POST requests in web \
applications. This is primarily useful for creating links where you wish to \
preserve some subset of the parameters to the current request, and \
potentially add or replace others. Given a query string this is doable with \
regexes, of course, but making sure you get the anchoring and escaping \
right is tedious and error-prone - this module is simpler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-URI-Query-0.16-1.12.noarch.rpm"
RPM_HASH = "004c3ea80bdfacc97f607aebc5b49fd914d0fdd4e6ebdc6e1ae4529c21c0ee3f8ef311b586027751eecf0970168fc07a25785ac9eadaa3ae10fe072f3a37e686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Query \
perl-URI-Query"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Clone \
perl-URI--Escape \
perl-parent"

inherit rpm

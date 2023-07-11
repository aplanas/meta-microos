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

RPM_NAME = "perl-URI-Query-0.16-1.11.noarch.rpm"
RPM_HASH = "9d3c0ac8472401b6485c56d6c761c77bab84c7cf37f0a6996ae628128b8d38088103807da8ab1a18fcdb59d2a449f138f88828dfa8a91eab1788387f9edc61da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Query \
perl-URI-Query"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Clone \
perl-URI--Escape \
perl-parent"

inherit rpm

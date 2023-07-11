SUMMARY = "Smart URI fetching/caching"
DESCRIPTION = "_URI::Fetch_ is a smart client for fetching HTTP pages, notably syndication \
feeds (RSS, Atom, and others), in an intelligent, bandwidth- and \
time-saving way. That means: \
 \
* * GZIP support \
 \
If you have _Compress::Zlib_ installed, _URI::Fetch_ will automatically try \
to download a compressed version of the content, saving bandwidth (and \
time). \
 \
* * _Last-Modified_ and _ETag_ support \
 \
If you use a local cache (see the _Cache_ parameter to _fetch_), \
_URI::Fetch_ will keep track of the _Last-Modified_ and _ETag_ headers from \
the server, allowing you to only download pages that have been modified \
since the last time you checked. \
 \
* * Proper understanding of HTTP error codes \
 \
Certain HTTP error codes are special, particularly when fetching \
syndication feeds, and well-written clients should pay special attention to \
them. _URI::Fetch_ can only do so much for you in this regard, but it gives \
you the tools to be a well-written client. \
 \
The response from _fetch_ gives you the raw HTTP response code, along with \
special handling of 4 codes: \
 \
  * * 200 (OK) \
 \
Signals that the content of a page/feed was retrieved successfully. \
 \
  * * 301 (Moved Permanently) \
 \
Signals that a page/feed has moved permanently, and that your database of \
feeds should be updated to reflect the new URI. \
 \
  * * 304 (Not Modified) \
 \
Signals that a page/feed has not changed since it was last fetched. \
 \
  * * 410 (Gone) \
 \
Signals that a page/feed is gone and will never be coming back, so you \
should stop trying to fetch it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-URI-Fetch-0.15-1.10.noarch.rpm"
RPM_HASH = "cec6b3035c8701d876d17534fdd45dcc0e71b508bd006c2fb2c7784a9ae321bad169cf33335c5734906b27d077d13fa17c992f6a9735afa60804594b8c5b614c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Fetch \
perl-URI--Fetch--Response \
perl-URI-Fetch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--ErrorHandler \
perl-LWP--UserAgent \
perl-URI"

inherit rpm

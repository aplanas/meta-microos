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

RPM_NAME = "perl-URI-Fetch-0.15-1.11.noarch.rpm"
RPM_HASH = "ae92fd45d7dd8803ab90577557ce242bb7437248cb04a25e7189193d0349d110bcaa490d3348c2ab56f950d4c69245da63b5aab505610d5e1d95f7286967e475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Fetch \
perl-URI--Fetch--Response \
perl-URI-Fetch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--ErrorHandler \
perl-LWP--UserAgent \
perl-URI"

inherit rpm

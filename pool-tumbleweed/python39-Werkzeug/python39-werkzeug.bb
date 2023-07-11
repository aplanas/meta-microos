SUMMARY = "The Swiss Army knife of Python web development"
DESCRIPTION = "Werkzeug started as simple collection of various utilities for WSGI \
applications and has become one of the most advanced WSGI utility \
modules.  It includes a powerful debugger, full featured request and \
response objects, HTTP utilities to handle entity tags, cache control \
headers, HTTP dates, cookie handling, file uploads, a powerful URL \
routing system and a bunch of community contributed addon modules. \
 \
Werkzeug is unicode aware and doesn't enforce a specific template \
engine, database adapter or anything else.  It doesn't even enforce \
a specific way of handling requests and leaves all that up to the \
developer. It's most useful for end user applications which should work \
on as many server environments as possible (such as blogs, wikis, \
bulletin boards, etc.)."
LICENSE = "BSD-3-Clause"

PV = "2.3.6"

RPM_NAME = "python39-Werkzeug-2.3.6-1.1.noarch.rpm"
RPM_HASH = "d95a7713379fb9055393ab622bc23249c751487f089e0b2af12735a84cf2930e56abee0190fb2d07a764f71f63756261c1b016bf103019a04253a8696aa50aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-werkzeug \
python39-Werkzeug \
python39-Werkzeug-doc \
python3dist-werkzeug"

RDEPENDS:${PN} += "python-abi \
python39-MarkupSafe"

inherit rpm

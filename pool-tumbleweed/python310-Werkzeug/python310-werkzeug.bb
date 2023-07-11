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

RPM_NAME = "python310-Werkzeug-2.3.6-1.1.noarch.rpm"
RPM_HASH = "b1861e5ef8e8e8340a057327c5f1eb3933cb5e13ef37da7cadaca27c7b6f1a0d2785ef396f68f627ec44e6b9e65e64d387641bf70b33d1b539a30a7cf4717ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-werkzeug \
python310-Werkzeug \
python310-Werkzeug-doc \
python3dist-werkzeug"

RDEPENDS:${PN} += "python-abi \
python310-MarkupSafe"

inherit rpm

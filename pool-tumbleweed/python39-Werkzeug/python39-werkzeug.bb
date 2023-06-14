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

PV = "2.2.3"

RPM_NAME = "python39-Werkzeug-2.2.3-2.1.noarch.rpm"
RPM_HASH = "2a06476e1dfef0c41772b68926473e5be2a00b2fbd5b8e9b30a68d648e4216661a00b9bf7b2f95ca2afac72b2ff718ff2c3fdd264447b38d39854bfdf996a514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-werkzeug \
python39-Werkzeug \
python39-Werkzeug-doc \
python3dist-werkzeug"

RDEPENDS:${PN} += "python-abi \
python39-MarkupSafe"

inherit rpm

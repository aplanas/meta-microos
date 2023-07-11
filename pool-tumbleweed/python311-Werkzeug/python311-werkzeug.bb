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

RPM_NAME = "python311-Werkzeug-2.3.6-1.1.noarch.rpm"
RPM_HASH = "f35249cd7fc9e310a79dce72b69abe79a335f17dd908ec078c34caaceb7ce559e811a7567ced65c4f40df31807cf58b5ceebe2c46ca06cd8b67714bc1350045b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Werkzeug \
python3-Werkzeug-doc \
python3.11dist-werkzeug \
python311-Werkzeug \
python311-Werkzeug-doc \
python3dist-werkzeug"

RDEPENDS:${PN} += "python-abi \
python311-MarkupSafe"

inherit rpm

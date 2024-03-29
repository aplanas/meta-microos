SUMMARY = "Friendlier RFC 6265-compliant cookie parser/renderer"
DESCRIPTION = "cookies.py is a Python module for working with HTTP cookies: parsing and \
rendering 'Cookie:' request headers and 'Set-Cookie:' response headers, \
and exposing a convenient API for creating and modifying cookies. It can be \
used as a replacement of Python's Cookie.py (aka http.cookies). \
 \
* Rendering according to RFC 6265. It uses URL encoding to represent \
  non-ASCII by default, like many other languages' libraries. \
* Liberal parsing, incorporating many complaints about Cookie.py \
  barfing on common cookie formats which can be reliably parsed \
* Documented code, with chapter and verse from RFCs \
* A test suite with 100% test coverage \
* Unlike Cookie.py, it doesn't lock all implementation inside its own \
  classes. You can suppress minor parse exceptions with parameters \
  rather than subclass wrappers. You can plug in your own parsers, \
  renderers and validators for new or existing cookie attributes. You \
  can render the data out in a dict. You can use the underlying \
  imperative API or even lift the parser's regexps for your own \
  parser or project. \
 \
While this is intended to be a good module for handling cookies, it does not \
even try to do any of the following: \
 \
* Backward compatibility with Cookie.py \
* Implementation of RFC 2109 or 2965 \
* Handle every conceivable output from legacy applications \
* Provide a means to store pickled Python objects in cookie values \
 \
This does not compete with the cookielib (http.cookiejar) module in the Python \
standard library."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python310-cookies-2.2.1-6.3.noarch.rpm"
RPM_HASH = "07ba5667d8633dc2412d366ac8d945176664283f4d80b62ffc34422abaf7e594d23657653fac6c7e94e73b353245c1e36b84146aeaf6da07d2d054cb5e48422c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cookies \
python310-cookies \
python3dist-cookies"

RDEPENDS:${PN} += "python-abi"

inherit rpm

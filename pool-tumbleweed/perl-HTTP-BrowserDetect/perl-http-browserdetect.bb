SUMMARY = "Determine Web browser, version, and platform from an HTTP user agent string"
DESCRIPTION = "The HTTP::BrowserDetect object does a number of tests on an HTTP user agent \
string. The results of these tests are available via methods of the object. \
 \
For an online demonstration of this module's parsing, you can check out \
http://www.browserdetect.org/ \
 \
This module was originally based upon the JavaScript browser detection code \
available at \
http://www.mozilla.org/docs/web-developer/sniffer/browser_type.html."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.38"

RPM_NAME = "perl-HTTP-BrowserDetect-3.38-1.2.noarch.rpm"
RPM_HASH = "2aa8cbeb6d8cf6c25e4b3505557ec43541971ccb7a4eeaf07e181854d76db9a7ddb211ad93e48a3aff3414bc4907c537763223115e1b541f74f65641a93d664d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--BrowserDetect \
perl-HTTP-BrowserDetect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

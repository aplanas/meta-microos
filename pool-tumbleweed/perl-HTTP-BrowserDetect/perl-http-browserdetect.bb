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

RPM_NAME = "perl-HTTP-BrowserDetect-3.38-1.3.noarch.rpm"
RPM_HASH = "4fe903216e493215e8ad97789cef46bbaf43d1c91222b0071cb91b6994478af5de3c68790e8ac96fe9f504ad2f1bd9972b2b3d2c541f4ac68451d5568e35f0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--BrowserDetect \
perl-HTTP-BrowserDetect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

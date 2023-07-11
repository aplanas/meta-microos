SUMMARY = "A simple perl Http Server"
DESCRIPTION = "Net::HTTPServer basically turns a CGI script into a stand alone server. \
Useful for temporary services, mobile/local servers, or embedding an HTTP \
server into another program."
LICENSE = "LGPL-2.0+"

PV = "1.1.1"

RPM_NAME = "perl-Net-HTTPServer-1.1.1-27.27.noarch.rpm"
RPM_HASH = "781f061d987d2e43aaec33abaf04fcdeff7e6f024c0c39ff5787f2ee716a43e01dec3167a3765b907a97d40020afd9be45fdd6bd83cadcb8af7ed98ed7efb9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--HTTPServer \
perl-Net--HTTPServer--CaptureSTDOUT \
perl-Net--HTTPServer--Request \
perl-Net--HTTPServer--Response \
perl-Net--HTTPServer--Session \
perl-Net-HTTPServer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-URI"

inherit rpm

SUMMARY = "A simple perl Http Server"
DESCRIPTION = "Net::HTTPServer basically turns a CGI script into a stand alone server. \
Useful for temporary services, mobile/local servers, or embedding an HTTP \
server into another program."
LICENSE = "LGPL-2.0+"

PV = "1.1.1"

RPM_NAME = "perl-Net-HTTPServer-1.1.1-27.28.noarch.rpm"
RPM_HASH = "1c107663fb64100b4d9a992330076f9d58f914a5b789b5f4a798ecf451c2d9779e2ba79215855b53f426a1f10d0a59f67677d03d2da449ae8ed010eadc9e4244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--HTTPServer \
perl-Net--HTTPServer--CaptureSTDOUT \
perl-Net--HTTPServer--Request \
perl-Net--HTTPServer--Response \
perl-Net--HTTPServer--Session \
perl-Net-HTTPServer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-URI"

inherit rpm

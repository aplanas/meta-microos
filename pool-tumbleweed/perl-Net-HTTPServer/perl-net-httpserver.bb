SUMMARY = "A simple perl Http Server"
DESCRIPTION = "Net::HTTPServer basically turns a CGI script into a stand alone server. \
Useful for temporary services, mobile/local servers, or embedding an HTTP \
server into another program."
LICENSE = "LGPL-2.0+"

PV = "1.1.1"

RPM_NAME = "perl-Net-HTTPServer-1.1.1-27.26.noarch.rpm"
RPM_HASH = "71ea7c4eb7cc7dab00acdbbca6911bac368bf3b7b9714587ae39b20d498272730cfc55b3d5c1c55d74b9255ecb89d6c26867603de2bad29610e06c5226043101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::HTTPServer) \
perl(Net::HTTPServer::CaptureSTDOUT) \
perl(Net::HTTPServer::Request) \
perl(Net::HTTPServer::Response) \
perl(Net::HTTPServer::Session) \
perl-Net-HTTPServer"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(URI)"

inherit rpm

SUMMARY = "Documentation for OpenStack Senlin API Client"
DESCRIPTION = "This is a client for the OpenStack Senlin API. \
It implements 100% of the OpenStack Senlin API. This package contains \
auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python-senlinclient-doc-2.4.0-1.7.noarch.rpm"
RPM_HASH = "411d6bfcc4e6d56da00a979353955604bec770188e34518da8ad64b0257dab830597b7dc0ca4336218a49f6cdf3a0596af62f2384a326ce3257a2bf0afbb5cec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-senlinclient-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "DTD Visualizing Tool"
DESCRIPTION = "The package comes with a Perl script (livedtd.pl) that converts an SGML \
or XML DTD (Document Type Definition) into an HTML document.  The HTML \
document is exactly the same text as the DTD but with 'live' links that \
let you navigate through the DTD. \
 \
 \
 \
Authors: \
-------- \
    Robert Stayton <bobs@sagehill.net>"
LICENSE = "BSD-3-Clause"

PV = "2007.1.15"

RPM_NAME = "livedtd-2007.1.15-21.16.noarch.rpm"
RPM_HASH = "c66318cb323bf3bd1d8ee2a62723f865066d68ec1189e03295884ec40a91b46f5fbf9ffd21ccab29161e048c8eb619063356d3b32bc4f9bbab434c5c96e09a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "livedtd \
perl(OASIS::Catalog)"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm

SUMMARY = "Ikiwiki w3m cgi meta-wrapper"
DESCRIPTION = "Enable to use all of ikiwiki's web features (page editing, etc) in \
the w3m web browser without using a web server. w3m supports local \
CGI scripts, and ikiwiki can be set up to run that way."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause"

PV = "3.20200202.3"

RPM_NAME = "ikiwiki-w3m-3.20200202.3-2.14.noarch.rpm"
RPM_HASH = "667cb0a02a1f9b3837f9114f55c72bc63ba89a91ca0309566928617dd9df3b0eeb2f10303e9b3e19c5fa8b346d885525b1ce70d7a15e86ffe52a17e709ab1269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ikiwiki-w3m"

RDEPENDS:${PN} += "/usr/bin/perl \
ikiwiki \
w3m"

inherit rpm
